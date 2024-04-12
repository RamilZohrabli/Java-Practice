package week11;
import java.io.*;
class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person: name = '" + name + '\'' + ", age = " + age;
    }

}
public class Task6 {
    public static void savingPersons(Person[] persons, String filename) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
        outputStream.writeObject(persons);  
        outputStream.close();     
    }

    public static void readingPersons(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
        Person[] persons = (Person[]) inputStream.readObject(); 
        for (Person person : persons) {
            System.out.println(person);
        }
        inputStream.close();
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Person[] persons = {
            new Person("Ramil", 18),
            new Person("James", 25),
        };

        String filename = "persons.bin";

        savingPersons(persons, filename);

        readingPersons(filename);
    }
}

