package week05;
import java.util.Scanner;
class Person{
    private String firstName;
    private String lastName;
    private String gender;
    public Person(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public void setGender(){
        this.gender = gender;
    }
    //Overridden toString() method from object class which is the root of all classes
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Gender: " + gender;
    }

    // Also overriding the equals() method from Object class which is more recommendable
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
    return equals((Person) obj);
    }


}
class Teacher extends Person{
    private String department;
    private String courses;
    public Teacher(String firstName, String lastName, String gender, String department, String courses){
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(){
        this.department = department;
    }
    public String getCourses(){
        return courses;
    }
    public void setCourses(){
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Teacher: " + getFirstName() + " " + getLastName() +
            ", Gender: " + getGender() +
            ", Department: " + department +
            ", Courses: " + courses;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Teacher teacher = (Teacher) obj;
        return department.equals(teacher.department) &&
                courses.equals(teacher.courses);
    }
    
}
class Student extends Person{
    private String studentId;
    public Student(String firstName, String lastName, String gender, String studentId){
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }
    public String getStudentID(){
        return studentId;
    }
    public void setStudentID(String studentId){
        this.studentId = studentId;
    }
    @Override
    public String toString(){
        return "Student: " + getFirstName() + " " + getLastName() + 
               ", Gender: " + getGender() +
               ", StudentID: " + getStudentID();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return super.equals(obj) && studentId.equals(student.getStudentID());
    }
}
class PhdStudent extends Student{
    private String department;
    private String courses;
    public PhdStudent(String firstName, String lastName, String gender,String studentId, String department, String courses){
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getCourses(){
        return courses;
    }
    public void setCourses(String courses){
        this.courses = courses;
    }
    @Override
    public String toString(){
        return "PhdStudent: " + getFirstName() + " " + getLastName() + 
               ", Gender: " + getGender() + 
               ", StudentID: " + getStudentID()+ 
               ", Department: " + department+
               ", Courses: " + courses;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        PhdStudent phdStudent = (PhdStudent) obj;
        return department.equals(phdStudent.department) &&
           courses.equals(phdStudent.courses);
    }
}  

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Teeacher's details: ");
        String teacherFirstName = scan.nextLine();
        String teacherLastName = scan.nextLine();
        String teacherGender = scan.nextLine();
        String teacherDepartment = scan.nextLine();
    }
}
