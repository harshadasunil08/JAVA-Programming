class Student {
    int rollno;
    String name;
    Student () {
        rollno = 1;
        name = "AIML";
    }
    void printData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}
class DefaultContructor {
 public static void main(String args[]) {
        Student s = new Student ();
        s.printData();
    }
}
