package main.ionio.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Map;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileBasics {

    public static void main(String[] args) {

        // path/file existence
        Path path = Paths.get("C:stub");
//        System.out.println(Files.exists(path));
//        System.out.println(Files.notExists(path));
        // !Files.exists() is not equivalent to Files.notExists():
        // - The file is verified to exist.
        // - The file is verified to not exist.
        // - The file's status is unknown. This result can occur when the program does not have access to the file.
        // To verify that the program can access a file as needed, you can use the isReadable(Path), isWritable(Path),
        // and isExecutable(Path) methods.

        // deleting file/directory
//        try {
//            Files.delete(path);
//        } catch (IOException e) { // With directories, the directory must be empty, or the deletion fails (DirectoryNotEmptyException)
//            e.printStackTrace();
//        }
        // alternative - deleteIfExists(path) - no exception is thrown

        //copying
//        try {
//            Path pathTest = Paths.get("C:\\BackUp\\knowledgeSharing\\testCopyFile.txt");
//            Files.copy(pathTest, Paths.get("C:\\BackUp\\knowledgeSharing\\anotherFolder")); // REPLACE_EXISTING
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // moving
//        try {
//            Files.move(path, Paths.get("/newPath"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Path path2 = Paths.get("C:\\BackUp\\knowledgeSharing");
        //Metadata
//        try {
//            Map<String, Object> size = Files.readAttributes(path2, "size");
//            System.out.println(size);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

         // Files attributes
//        try {
//            BasicFileAttributes basicFileAttributes = Files.readAttributes(path2, BasicFileAttributes.class);
//            System.out.println("Creation time: " + basicFileAttributes.creationTime());
//            System.out.println("Is directory: " + basicFileAttributes.isDirectory());
//            DosFileAttributes dosFileAttributes = Files.readAttributes(path2, DosFileAttributes.class);
//            System.out.println("isReadOnly: " + dosFileAttributes.isReadOnly());
//            System.out.println("isHidden: " + dosFileAttributes.isHidden());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

          // Memory space
//        try {
//            FileStore fileStore = Files.getFileStore(path2);
//            System.out.println(fileStore.getTotalSpace());
//            System.out.println(fileStore.getUsableSpace());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
