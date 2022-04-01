package main.ionio.io.objectstreams;

import java.io.*;
import java.util.Arrays;

public class ObjectStreams {

    private static final String TEXT_FILE = "objectsFile";
    private static final String STRING = "String";
    private static final int[] ints = {3, 8, 2, 0};

    public static void main(String[] args) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(TEXT_FILE));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(TEXT_FILE))) {
            outputStream.writeObject(STRING);
            outputStream.writeObject(ints);
            outputStream.writeObject(new TestObject());
            String string = (String) inputStream.readObject();
            int[] ints = (int[]) inputStream.readObject();
            TestObject testObject = (TestObject) inputStream.readObject();
            System.out.println(string + "\n" + Arrays.toString(ints));
            System.out.println(testObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static class TestObject {

        int id = 44;
        String name = "testName";

        @Override
        public String toString() {
            return "TestObject{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
