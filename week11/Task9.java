package week11;
import java.util.*;
import java.io.*;

class PersonCSV {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public PersonCSV(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + "," + firstName + "," + lastName + "," + age;
    }
}

class CSVReader {
    public static List<PersonCSV> readCSV(String filename) throws IOException {
        List<PersonCSV> persons = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        br.readLine(); // Skip header row
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String firstName = data[1];
            String lastName = data[2];
            int age = Integer.parseInt(data[3]);
            persons.add(new PersonCSV(id, firstName, lastName, age)); // Corrected class name
        }
        br.close();
        return persons;
    }
}

public class Task9 {
    public static void main(String[] args) {
        try {
            List<PersonCSV> persons = CSVReader.readCSV("persons.csv"); // Changed import and usage

            int totalAge = 0;
            for (PersonCSV person : persons) { // Changed type here as well
                totalAge += person.getAge();
            }
            double averageAge = (double) totalAge / persons.size();
            System.out.println("Average age: " + averageAge);

            List<PersonCSV> underAverageAge = new ArrayList<>();
            List<PersonCSV> aboveAverageAge = new ArrayList<>();

            for (PersonCSV person : persons) { // Changed type here as well
                if (person.getAge() < averageAge) {
                    underAverageAge.add(person);
                } else if (person.getAge() > averageAge) {
                    aboveAverageAge.add(person);
                }
            }

            FileWriter underWriter = new FileWriter("under_average_age.csv");
            for (PersonCSV person : underAverageAge) { // Changed type here as well
                underWriter.write(person.toString() + "\n");
            }
            underWriter.close();

            FileWriter aboveWriter = new FileWriter("above_average_age.csv");
            for (PersonCSV person : aboveAverageAge) { // Changed type here as well
                aboveWriter.write(person.toString() + "\n");
            }
            aboveWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
