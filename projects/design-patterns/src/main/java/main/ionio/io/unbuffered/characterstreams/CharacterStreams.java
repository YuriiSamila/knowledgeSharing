package main.ionio.io.unbuffered.characterstreams;

import java.io.*;

public class CharacterStreams {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("charStreamRead.txt");
             FileWriter writer = new FileWriter("charStreamWrite.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (BufferedReader reader = new BufferedReader(new FileReader("charStreamRead.txt"));
//             PrintWriter outputStream = new PrintWriter(new FileWriter("charStreamWrite.txt"))) {
//            String c;
//            while ((c = reader.readLine()) != null) {
//                outputStream.println(c);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
