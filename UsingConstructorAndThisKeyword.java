class Student {
    int rollno;
    String name;
    Student (int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    void printData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}
public class UsingConstructorAndThisKeyword {
    public static void main(String args[]) {
        Student s1 = new Student (1, "AIML");
        Student s2 = new Student (2, "CSE");
        s1.printData();
        s2.printData();
    }
}