import java.util.Scanner;
class Scanner {
    public static void main (String args[]) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int a;
        System.out.println("Enter a number: ");
        a = s.nextInt();
        System.out.println("You Entered: " + a);
    }
}