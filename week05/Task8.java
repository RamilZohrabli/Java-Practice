package week05;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Gender: " + gender;
    }

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

class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        StringBuilder courseList = new StringBuilder();
        for (int i = 0; i < courses.length; i++) {
            courseList.append(courses[i]);
            if (i != courses.length - 1) { 
                courseList.append(", ");
            }
        }
        return "Teacher: " + getFirstName() + " " + getLastName() +
                ", Gender: " + getGender() +
                ", Department: " + department +
                ", Courses: " + courseList.toString();
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
        if (!department.equals(teacher.department)) {
            return false;
        }
        if (courses.length != teacher.courses.length) {
            return false;
        }
        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(teacher.courses[i])) {
                return false;
            }
        }
        return true;
    }
}

class Student extends Person {
    private String studentId;

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentID() {
        return studentId;
    }

    public void setStudentID(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student: " + getFirstName() + " " + getLastName() +
                ", Gender: " + getGender() +
                ", StudentID: " + studentId;
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

class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        StringBuilder courseList = new StringBuilder();
        for (int i = 0; i < courses.length; i++) {
            courseList.append(courses[i]);
            if (i != courses.length - 1) { 
                courseList.append(", ");
            }
        }
        return "PhdStudent: " + getFirstName() + " " + getLastName() +
                ", Gender: " + getGender() +
                ", StudentID: " + getStudentID() +
                ", Department: " + department +
                ", Courses: " + courseList.toString();
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
        if (!department.equals(phdStudent.department)) {
            return false;
        }
        if (courses.length != phdStudent.courses.length) {
            return false;
        }
        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(phdStudent.courses[i])) {
                return false;
            }
        }
        return true;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Teacher's details: ");
        String teacherFirstName = scan.nextLine();
        String teacherLastName = scan.nextLine();
        String teacherGender = scan.nextLine();
        String teacherDepartment = scan.nextLine();
        System.out.println("Courses: ");
        String[] teacherCourses = scan.nextLine().split(",");

        Teacher teacher = new Teacher(teacherFirstName, teacherLastName, teacherGender, teacherDepartment, teacherCourses);

        System.out.println("Student's details: ");
        String studentFirstName = scan.nextLine();
        String studentLastName = scan.nextLine();
        String studentGender = scan.nextLine();
        String studentId = scan.nextLine();

        Student student = new Student(studentFirstName, studentLastName, studentGender, studentId);
        
        System.out.println("PhdStudent's details: ");
        String phdStudentFirstName = scan.nextLine();
        String phdStudentLastName = scan.nextLine();
        String phdStudentGender = scan.nextLine();
        String phdStudentId = scan.nextLine(); 
        String phdStudentDepartment = scan.nextLine();
        System.out.println("Courses: ");
        String[] phdStudentCourses = scan.nextLine().split(",");

        Student phdStudent = new PhdStudent(phdStudentFirstName, phdStudentLastName, phdStudentGender, phdStudentId, phdStudentDepartment, phdStudentCourses);
        
        scan.close();
        
        System.out.println(teacher);
        System.out.println(student);
        System.out.println(phdStudent);
    }
}
