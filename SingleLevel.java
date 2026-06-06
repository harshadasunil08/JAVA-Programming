class StudentInfo {
    int rollno;
    String name;
    void getData (int r, String n ) {
        rollno = r;
        name = n;
    }
    void printData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}
class StudentMarks extends StudentInfo {
    int marks;
    void getMarks (int m) {
        marks = m;
    }
    void printMarks() {
        System.out.println("Marks: " + marks);
    }
}
class SingleLevel{
    public static void main(String args[]) {
        StudentInfo s = new StudentInfo();
        s.getData(1, "AIML");
        s.printData();
    }
}
