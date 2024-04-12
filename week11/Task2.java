package week11;
import java.io.*;
public class Task2 {
    public static void main(String[] args) throws IOException{
        String stringData = "Java";
        String file = "output.txt";

        //a. Storing in file
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(stringData.getBytes());
        fos.close();

        //b. Checking the content by printing it using BufferReader
        BufferedReader bufread = new BufferedReader(new FileReader(file));
        String s;
        while((s = bufread.readLine())!= null){
            System.out.println(s);
        }
        bufread.close();

        //c.Reading the content of file with FileInputStream
        FileInputStream fis = new FileInputStream(file);
        StringBuilder content = new StringBuilder();
        int ch;

        // i. using read() method
        while((ch = fis.read())!= -1){
            content.append((char)ch);
        }
        System.out.println(content);
        fis.close();
        
        // ii. using read(byte[]) method
        fis = new FileInputStream(file);
        byte[] b = new byte[1024];
        int read;
        content = new StringBuilder();
        while((read = fis.read(b))!= -1){
            content.append(new String(b,0,read));
        }
        System.out.println(content);
        fis.close();
        
    }
}
