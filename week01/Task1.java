//This is our package which must be folder's name
package week01;
//This is our class Task1 and it must be file's name 
public class Task1 {
    //public means that the method is accessible outside this class
    //static means that the calling of the method can be implemented without instance
    //void is return type of method 'main'
    //main is specific method of Java
    //String[] is an indicator of array's type
    //args name of parameter
    public static void main(String[] args) {
        System.out.println("Hello User " + args[0] + "." + " Nice to meet you");
        System.out.println("I am Ramil Zohrabli");
        //the println is for print line that it is used printing line of text
        //args syntax is for getting input from terminal in the first line 
    }
}