class Student {
    int rollno = 1;
    String name = "AIML"; 
}
class ObjectDeclarationAndObjectCreation {
    public static void main(String[] args) {
        Student s;
        s = new Student();
        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
    }
}
