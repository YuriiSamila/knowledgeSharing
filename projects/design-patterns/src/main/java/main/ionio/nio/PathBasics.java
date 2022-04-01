package main.ionio.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathBasics {

    public static void main(String[] args) throws IOException {
        // basics
        Path path = Paths.get("C:\\knowledgeSharing\\createdByPath");
//        System.out.format("toString: %s%n", path);
//        System.out.format("fileName: %s%n", path.getFileName());
//        System.out.format("name: %s%n", path.getName(0));
//        System.out.format("nameCount: %s%n", path.getNameCount());
//        System.out.format("parent: %s%n", path.getParent());
//        System.out.format("root: %s%n", path.getRoot());
        Path relativePath = Paths.get("knowledgeSharing\\createdByPath");
//        System.out.println(relativePath);
//        String userPath = System.getProperty("user.home");
//        System.out.println(userPath);

        // to open in browse
//        System.out.println(path.toUri());

        // change relative path to absolut
        //System.out.println(relativePath.toAbsolutePath());

        // toRealPath means
        // - If the Path is relative, it returns an absolute path
        // - If the Path contains any redundant elements, it returns a path with those elements removed.
        // Many file systems use "." notation to denote the current directory and ".." to denote the parent directory
//        try {
//        Path relativePath2 = Paths.get("dataFile");
//            Path realPath = relativePath2.toRealPath();
//            System.out.println(realPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // joining paths
//        System.out.println(path.resolve("bar"));

        // creating a Path between two paths
        // In the absence of any other information, it is assumed that pathA and pathB are siblings, meaning nodes that reside at the same level in the tree structure
        // To navigate from pathA to pathB, you would expect to first navigate one level up to the parent node and then down to pathB:
//        Path pathA = Paths.get("pathA");
//        Path pathB = Paths.get("pathB");
//        Path pathAB = pathA.relativize(pathB);
//        System.out.println(pathAB);

        // comparing
//        Path barPath = Paths.get("/home/bar");
//        Path fooPath = Paths.get("/home/foo");
//        Path homePath = Paths.get("/home");
//        System.out.println(barPath.equals(fooPath));
//        System.out.println(barPath.startsWith(homePath));
//        System.out.println(barPath.endsWith("abc"));

        // iteration
        // The Path class implements the Iterable interface
//        for (Path elem : path) {
//            System.out.println(elem);
//       }

    }

}
