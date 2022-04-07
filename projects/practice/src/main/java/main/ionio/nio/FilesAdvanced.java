package main.ionio.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesAdvanced {

    public static void main(String[] args) {

        // Reading/Writing All Bytes or Lines from a File (using for small files)
        Path fileRead = Paths.get("C:\\BackUp\\knowledgeSharing\\tempFileRead.txt");
        Path fileWrite = Paths.get("C:\\BackUp\\knowledgeSharing\\tempFileWrite.txt");
//        byte[] bytes;
//        try {
//            bytes = Files.readAllBytes(fileRead);
//            for (byte b : bytes) {
//                System.out.println((char) b);
//            }
//            Files.write(fileWrite, bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Buffered I/O Methods for Text Files
//        Path fileWriteCustomString = Paths.get("C:\\BackUp\\knowledgeSharing\\tempFileWriteCustomString.txt");
//        try (BufferedReader reader = Files.newBufferedReader(fileRead);
//             BufferedWriter writer = Files.newBufferedWriter(fileWriteCustomString)) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            String customString = "Custom String";
//            writer.write(customString);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Methods for Unbuffered Streams and Interoperable with java.io APIs
//        Path fileWriteIO = Paths.get("C:\\BackUp\\knowledgeSharing\\tempFileWriteIO.txt");
//        try (InputStream inputStream = Files.newInputStream(fileRead);
//        OutputStream outputStream = Files.newOutputStream(fileWriteIO)){
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            String outPutStreamString = "outPutStreamString";
//            byte[] bytes = outPutStreamString.getBytes();
//            outputStream.write(bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Reading and Writing Files by Using Channel I/O
        // While stream I/O reads a character at a time, channel I/O reads a buffer at a time
//        try (SeekableByteChannel byteChannel = Files.newByteChannel(fileRead)){
//            ByteBuffer byteBuffer = ByteBuffer.allocate(15); //buffer's capacity
//            String encoding = System.getProperty("file.encoding");  // Read the bytes with the proper encoding for this platform. If
//                                                                    // you skip this step, you might see foreign or illegible
//                                                                    // characters.
//            while (byteChannel.read(byteBuffer) > 0) {
//                byteBuffer.flip();
//                System.out.println(Charset.forName(encoding).decode(byteBuffer));
//                byteBuffer.clear();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

}
