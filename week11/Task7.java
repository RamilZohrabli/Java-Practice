package week11;
import java.io.File;

public class Task7 {

    public static void printFileInfo(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File or directory does not exist.");
            return;
        }

        System.out.println(file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        if (file.isDirectory()) {
            System.out.println("Type: Directory");
            System.out.println("Contents:");
            File[] contents = file.listFiles();
            if (contents != null) {
                for (File content : contents) {
                    System.out.println(content.getName());
                }
            }
        } else {
            System.out.println("Type: File");
        }
        System.out.println();
    }

    public static void traverseDirectory(String path) {
        printFileInfo(path);
        File file = new File(path);
        if (file.isDirectory()) {
            File[] contents = file.listFiles();
            if (contents != null) {
                for (File content : contents) {
                    traverseDirectory(content.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        String path = "example_directory"; 
        traverseDirectory(path);
    }
}
