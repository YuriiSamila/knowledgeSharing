package main.ionio.io.datastreams;

import java.io.*;

public class DataStreams {

    private static final String DATA_FILE = "dataFile";
    private static final double[] doubles = {4.5, 6.7, 9.0};
    private static final int[] ints = {3, 7, 1};
    private static final String[] strings = {"one", "three", "ten"};

    public static void main(String[] args) throws IOException {

        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(DATA_FILE)))) {
            for (int i = 0; i < doubles.length; i++) {
                outputStream.writeDouble(doubles[i]);
                outputStream.writeInt(ints[i]);
                outputStream.writeUTF(strings[i]); // The writeUTF method writes out String values in a modified form of UTF-8.
                // This is a variable-width character encoding that only needs a single byte for common Western characters
            }
        }
        double d;
        int i;
        String s;
        try (DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(DATA_FILE)))) {
            int index = 0;
            while (index < 3) {
                d = inputStream.readDouble();
                i = inputStream.readInt();
                s = inputStream.readUTF();
                System.out.println(d + "; " + i + "; " + s);
                index++;
            }
        } catch (EOFException e) {
            // Notice that DataStreams detects an end-of-file condition by catching EOFException,
            // instead of testing for an invalid return value.
            // All implementations of DataInput methods use EOFException instead of return values.
            e.printStackTrace();
        }

    }

}
