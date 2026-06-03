class Student {
    int rollno;
    String name;
    Student (int rollno, String name) {
        rollno = r;
        name = n;
    }
    void printData() {
        System.out.println("Roll No: " +r);
        System.out.println("Name: " +n);
    }
}
class ParameterisedConstructor {
    public static void main(String args[]) {
        Student s1 = new Student (1, "AIML");
        Student s2 = new Student (2, "CSE");
        s1.printData();
        s2.printData();
    }
}
