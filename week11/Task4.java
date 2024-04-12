package week11;
import java.io.*;
public class Task4 {
    public static void main(String[] agrs) throws IOException{
        //Writing
        String file = "test.txt";
        String text = "Coding!";
        FileWriter wr = new FileWriter(file);
        wr.write(text);
        wr.close();

        //Reading with read()
        FileReader reader1 = new FileReader(file);
        StringBuilder s1 = new StringBuilder();
        int ch;
        while((ch = reader1.read()) != -1){
            s1.append((char)ch);
        }
        reader1.close();

        //Reading with read(char[]) method
        FileReader reader2 = new FileReader(file);
        StringBuilder s2 = new StringBuilder();
        char[] b =new char[1024];
        int characterRead;
        while((characterRead = reader2.read(b)) != -1){
            s2.append(b,0,characterRead);
        }
        System.out.println(s2.toString());
        reader2.close();
    }
}
