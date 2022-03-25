package main.ionio.nio;

public class PathBasics {

    public static void main(String[] args) {
        // basics
//        String userPath = System.getProperty("user.home");
//        System.out.println(userPath);
//        Path path = Paths.get("C:\\knowledgeSharing\\createdByPath");
//        System.out.format("toString: %s%n", path);
//        System.out.format("fileName: %s%n", path.getFileName());
//        System.out.format("name: %s%n", path.getName(0));
//        System.out.format("nameCount: %s%n", path.getNameCount());
//        System.out.format("parent: %s%n", path.getParent());
//        System.out.format("root: %s%n", path.getRoot());
//        Path relativePath = Paths.get("knowledgeSharing\\createdByPath");
//        System.out.println(relativePath);
        // to open in browse
//        System.out.println(path.toUri());
        // change relative path to absolut
//        System.out.println(relativePath.toAbsolutePath());
        // get realPath means
        // - If the Path is relative, it returns an absolute path
        // - If the Path contains any redundant elements, it returns a path with those elements removed.
//        try {
//            Path realPath = relativePath.toRealPath();
//            System.out.println(realPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // joining paths
//        System.out.println(path.resolve("bar"));
        // creating a Path between two paths
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
//        for (Path elem : path) {
//            System.out.println(elem);
//       }
    }

}
