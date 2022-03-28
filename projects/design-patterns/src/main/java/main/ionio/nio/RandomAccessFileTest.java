package main.ionio.nio;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class RandomAccessFileTest {

    public static void main(String[] args) {

        Path fileRead = Paths.get("C:\\BackUp\\knowledgeSharing\\randomAccessFile.txt");
        String string = "What is the best?\n";
        byte[] data = string.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data); // Wraps a byte array into a buffer
        ByteBuffer copy = ByteBuffer.allocate(17);
        try (FileChannel fc = (FileChannel.open(fileRead, READ, WRITE)) ){ //opens a file for both reading and writing
            // Read the first 17 bytes of the file
           int nRead;
           do {
               nRead = fc.read(copy);
           } while (nRead != -1 && copy.hasRemaining());
            // Write "What is the best?"
            fc.write(out);
            while (out.hasRemaining()) {
                fc.write(out);
                out.rewind();
            }
            // Move to the end of the file.  Copy the first 17 bytes to
            // the end of the file.  Then write "What is the best?" again.
            long length = fc.size();
            fc.position(length - 1);
            copy.flip();
            while (copy.hasRemaining()) {
                fc.write(copy);
            }
            while (out.hasRemaining()) {
                fc.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
