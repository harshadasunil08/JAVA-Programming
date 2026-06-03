class Student {
    int rollno; String name;   //Instance variable
    static String branch = "CSE";   //Static variable
    void getData() {
        rollno = r;
        name = n;
    }
    void printData() {
        System.out.println("Roll No: " +r);
        System.out.println("Name: " + n);
        System.out.println("Branch: " + branch);
    }
}
class Variables {
    public static void main(String args[]) {
        Student s1 = new Student ();
        s1.getData(1, "AIML");
        s1.printData();
    }
}
