package week11;
import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String originalFilePath = "output.txt";
        String duplicateFilePath = "duplicate_output.txt";

        FileInputStream originalFileInputStream = new FileInputStream(originalFilePath);
        FileOutputStream duplicateFileOutputStream = new FileOutputStream(duplicateFilePath);

        int byteRead;
        while ((byteRead = originalFileInputStream.read()) != -1) {
            duplicateFileOutputStream.write(byteRead);
        }

        originalFileInputStream.close();
        duplicateFileOutputStream.close();
    }

    public static boolean isFilesIdentical(String filePath1, String filePath2) throws IOException {
        try (FileInputStream fileInputStream1 = new FileInputStream(filePath1)) {
            try (FileInputStream fileInputStream2 = new FileInputStream(filePath2)) {
                int byte1, byte2;
                while ((byte1 = fileInputStream1.read()) != -1 && (byte2 = fileInputStream2.read()) != -1) {
                    if (byte1 != byte2) {
                        return false;
                    }
                }
                fileInputStream1.close();
                fileInputStream2.close();
            }
        }
        return true;
    }
}

