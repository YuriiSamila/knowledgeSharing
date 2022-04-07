package main.annotations;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@TestAnnotation(value = "firstAnnotation", number = 5)
public class Main {

    public static void main(String[] args) {
        testAnnotation();
    }

    private static void testAnnotation() {
        Annotation[] declaredAnnotations = AnnotationExercise.class.getDeclaredAnnotations();
        System.out.println(Arrays.toString(declaredAnnotations));
        TestAnnotation annotation = AnnotationExercise.class.getAnnotation(TestAnnotation.class);
        System.out.println(annotation.value() + " " + annotation.number());
    }

}
