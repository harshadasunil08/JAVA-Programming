package Projects;
import java.util.*;
import java.io.*;
class Book {
    String name;
    int copies;
    Book(String name, int copies) {
        this.name = name;
        this.copies = copies;
    }
}
class Student {
    String name;
    int rollNo;
    ArrayList<String> borrowedBooks = new ArrayList<>();
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class LibraryManagementSystem {

    static ArrayList<Book> libraryBooks = new ArrayList<>();
    static ArrayList<Student> registeredStudents = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        loadBooks();
        loadStudents();
        boolean running = true;
        while (running) {
            System.out.println("\n1.Register Student\n2.Add Book\n3.Borrow\n4.Return\n5.Student Status\n6.Book Status\n7.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1: registerStudent(); break;
                case 2: registerBook(); break;
                case 3: borrowBook(); break;
                case 4: returnBook(); break;
                case 5: studentStatus(); break;
                case 6: bookStatus(); break;
                case 7: 
                    saveBooks();
                    saveStudents();
                    running = false; 
                    break;
            }
        }
    }
    static void saveBooks() {
        try {
            FileWriter fw = new FileWriter("books.txt");
            for (Book b : libraryBooks) {
                fw.write(b.name + "," + b.copies + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving books!");
        }
    }
    static void loadBooks() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("books.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                libraryBooks.add(new Book(data[0], Integer.parseInt(data[1])));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("No previous book data found.");
        }
    }
    static void saveStudents() {
        try {
            FileWriter fw = new FileWriter("students.txt");
            for (Student s : registeredStudents) {
                fw.write(s.rollNo + "," + s.name + "," + s.borrowedBooks + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving students!");
        }
    }
    static void loadStudents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Student s = new Student(Integer.parseInt(data[0]), data[1]);
                registeredStudents.add(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("No previous student data found.");
        }
    }
    static Student findStudent(int roll) {
        for (Student s : registeredStudents) {
            if (s.rollNo == roll) return s;
        }
        return null;
    }
    static Book findBook(String name) {
        for (Book b : libraryBooks) {
            if (b.name.equalsIgnoreCase(name)) return b;
        }
        return null;
    }
    static void registerStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        if (findStudent(roll) != null) {
            System.out.println("Student exists!");
            return;
        }
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        registeredStudents.add(new Student(roll, name));
    }
    static void registerBook() {
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        if (findBook(name) != null) {
            System.out.println("Book exists!");
            return;
        }
        System.out.print("Copies: ");
        int copies = sc.nextInt();
        sc.nextLine();
        libraryBooks.add(new Book(name, copies));
    }
    static void borrowBook() {
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Book Name: ");
        String name = sc.nextLine();
        Student s = findStudent(roll);
        Book b = findBook(name);
        if (s == null || b == null || b.copies <= 0) {
            System.out.println("Error!");
            return;
        }
        b.copies--;
        s.borrowedBooks.add(name);
    }
    static void returnBook() {
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Book Name: ");
        String name = sc.nextLine();
        Student s = findStudent(roll);
        Book b = findBook(name);
        if (s == null || b == null || !s.borrowedBooks.contains(name)) {
            System.out.println("Error!");
            return;
        }
        s.borrowedBooks.remove(name);
        b.copies++;
    }
    static void studentStatus() {
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        Student s = findStudent(roll);
        if (s != null) {
            System.out.println(s.name + " -> " + s.borrowedBooks);
        } 
        else {
            System.out.println("Not found!");
        }
    }
    static void bookStatus() {
        System.out.print("Book Name: ");
        String name = sc.nextLine();
        Book b = findBook(name);
        if (b != null) {
            System.out.println(b.name + " copies: " + b.copies);
        } 
         else {
            System.out.println("Not found!");
        }
    }

