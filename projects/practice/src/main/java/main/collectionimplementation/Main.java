package main.collectionimplementation;

import static java.lang.Thread.sleep;

public class Main {

    @SuppressWarnings("all")
    public static void main(String[] args) throws InterruptedException {
        TrackedList<String> trackedList = new TrackedList<>();
        trackedList.add("Second");
        sleep(1000);
        trackedList.add("First");
        sleep(1000);
        trackedList.add("Third");
        sleep(1000);
        trackedList.add("Fourth");
        System.out.println(trackedList.getTheFreshestElement());
        System.out.println(trackedList.getTheOldestElement());
        System.out.println(trackedList.getLastModificationTime("Third"));
        sleep(2000);
        trackedList.update("Third");
        System.out.println(trackedList.getLastModificationTime("Third"));
    }

}
