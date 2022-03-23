package main.io.unbuffered.characterstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("testText.txt");
             FileWriter writer = new FileWriter("copiedText.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
