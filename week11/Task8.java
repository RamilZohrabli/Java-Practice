package week11;
import java.io.*;
import java.util.*;

public class Task8 {

    public static void generateFileWithRandomIntegers(String filename, int numberOfIntegers) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filename, "rw");
        Random random = new Random();
        for (int i = 0; i < numberOfIntegers; i++) {
            file.writeInt(random.nextInt());
        }
        file.close();
    }


    public static void readAllContents(String filename) throws IOException{
        RandomAccessFile file = new RandomAccessFile(filename, "r");
        while (file.getFilePointer() < file.length()) {
            System.out.println(file.readInt());
        }
        file.close();       
    }

    public static void printIntegersFromOffset(String filename, long offset, int count) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filename, "r");
        file.seek(offset);
        for (int i = 0; i < count; i++) {
            System.out.println(file.readInt());
        }
        file.close();
    }

    public static void printIntegersFromEndReverse(String filename, int count) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filename, "r");
        long fileLength = file.length();
        for (int i = 0; i < count; i++) {
            long position = fileLength - (i + 1) * Integer.BYTES;
            if (position < 0) break;
            file.seek(position);
            System.out.println(file.readInt());
        }
        file.close();
    }

    public static void main(String[] args) throws IOException {
        String file = "random_integers.dat";
        generateFileWithRandomIntegers(file, 15);
        readAllContents(file);
        printIntegersFromOffset(file, 6, 5);
        printIntegersFromEndReverse(file, 7);
    }
}
