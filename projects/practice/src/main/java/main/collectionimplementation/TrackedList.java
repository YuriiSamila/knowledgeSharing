package main.collectionimplementation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.LocalDateTime.now;

public class TrackedList<T> extends AbstractList<T> {

    private Object[] elements;

    public TrackedList() {
        this.elements = new Object[10];
    }

    @Override
    public boolean add(T element) {
        int nullElementsNumber = (int) Arrays.stream(elements)
                .filter(Objects::isNull)
                .count();
        if (nullElementsNumber > 0) {
            elements[elements.length - nullElementsNumber] = new TrackedElement(element, now());
        } else {
            elements = Arrays.copyOf(elements, elements.length + 10);
            elements[elements.length] = new TrackedElement(element, now());
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public boolean update(T element) {
        if (Arrays.stream(elements)
                .filter(Objects::nonNull)
                .noneMatch(elem -> {
                    TrackedElement trackedElement = (TrackedElement) elem;
                    return trackedElement.element.equals(element);
                })) {
            return add(element);
        }
        get(element).changed = now();
        return true;
    }

    @SuppressWarnings("unchecked")
    public T getTheOldestElement() {
        Optional<Object> objectOptional = Arrays.stream(elements)
                .filter(Objects::nonNull)
                .min(Comparator.comparing(elem -> ((TrackedElement) elem).changed));
        if (objectOptional.isPresent()) {
            TrackedElement trackedElement = (TrackedElement) objectOptional.get();
            return trackedElement.element;
        }
        throw new NoSuchElementException();
    }

    @SuppressWarnings("unchecked")
    public T getTheFreshestElement() {
        Optional<Object> objectOptional = Arrays.stream(elements)
                .filter(Objects::nonNull)
                .max(Comparator.comparing(elem -> ((TrackedElement) elem).changed));
        if (objectOptional.isPresent()) {
            TrackedElement trackedElement = (TrackedElement) objectOptional.get();
            return trackedElement.element;
        }
        throw new NoSuchElementException();
    }

    @SuppressWarnings("unchecked")
    public String getLastModificationTime(T element) {
        Optional<Object> freshElement = Arrays.stream(elements)
                .filter(Objects::nonNull)
                .filter(elem -> {
                    TrackedElement trackedElement = (TrackedElement) elem;
                    return trackedElement.element == element;
                })
                .sorted()
                .findFirst();
        if (freshElement.isPresent()) {
            TrackedElement trackedElement = (TrackedElement) freshElement.get();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            return dateTimeFormatter.format(trackedElement.changed.toLocalTime());
        }
        throw new NoSuchElementException();
    }

    @Override
    public int size() {
        return elements.length;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        TrackedElement trackedElement = (TrackedElement) elements[index];
        if (trackedElement != null) {
            return trackedElement.element;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private TrackedElement get(T element) {
        Optional<Object> objectOptional = Arrays.stream(elements)
                .filter(elem -> ((TrackedElement) elem).element == element)
                .findFirst();
        if (objectOptional.isPresent()) {
            return (TrackedElement) objectOptional.get();
        }
        throw new NoSuchElementException();
    }

    public class TrackedElement implements Comparator<TrackedElement> {
        private final T element;
        private LocalDateTime changed;

        public TrackedElement(T element, LocalDateTime changed) {
            this.element = element;
            this.changed = changed;
        }

        @Override
        public int compare(TrackedElement o1, TrackedElement o2) {
            return o2.changed.compareTo(o1.changed);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrackedList<?> that = (TrackedList<?>) o;
        return Arrays.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

}
