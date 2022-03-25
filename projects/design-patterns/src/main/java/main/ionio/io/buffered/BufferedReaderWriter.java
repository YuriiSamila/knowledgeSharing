package main.ionio.io.buffered;

import java.io.*;

public class BufferedReaderWriter {

//    Unbuffered I/O means each read or write request is handled directly by the underlying OS.
//    This can make a program much less efficient, since each such request often triggers disk access, network activity,
//    or some other operation that is relatively expensive.
//    To reduce this kind of overhead, the Java platform implements buffered I/O streams.
//    Buffered input streams read data from a memory area known as a buffer; the native input API is called only when the buffer is empty.
//    Similarly, buffered output streams write data to a buffer, and the native output API is called only when the buffer is full.

    public static void main(String[] args) {
    write();
    read();
    }

    private static void write() {
        String[] names = {"Oleh", "Vasyl", "Marta"};
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("output.txt"))) {
            for (String name : names) {
                writer.write("\n" + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))){
             String line;
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
