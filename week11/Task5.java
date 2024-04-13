package week11;
import java.io.*;

public class Task5 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("poem.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
            
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
