package main.ionio.io.unbuffered.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("byteStreamRead.txt");
             FileOutputStream outputStream = new FileOutputStream("byteStreamWrite.txt")) {
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println(c);
                //outputStream.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
