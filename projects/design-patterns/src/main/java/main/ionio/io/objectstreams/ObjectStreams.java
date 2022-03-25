package main.ionio.io.objectstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectStreams {

    private static final String TEXT_FILE = "textFile.txt";
    private static final String STRING = "String";
    private static final int[] ints = {3, 8, 2, 0};

    public static void main(String[] args) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(TEXT_FILE));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(TEXT_FILE))){
            outputStream.writeObject(STRING);
            outputStream.writeObject(ints);
            String string = (String) inputStream.readObject();
            int[] ints = (int[]) inputStream.readObject();
            System.out.println(string + "\n" + Arrays.toString(ints));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
