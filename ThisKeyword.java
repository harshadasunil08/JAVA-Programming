class Data {
    int rollno;
    String name;
    void getData (int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    void printData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}
class ThisKeyword {
    public static void main(String args[]) {
        Student s = new Student();
        s.getData(1, "AIML");
        s.printData();
    }
}
