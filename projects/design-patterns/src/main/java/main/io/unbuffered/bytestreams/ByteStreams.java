package main.io.unbuffered.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("testText.txt");
                FileOutputStream outputStream = new FileOutputStream("copiedText.txt")){
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
