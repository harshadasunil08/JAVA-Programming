import java.io.*;

class DeleteFile {
    public static void main(String args[]) {

        File f = new File("output.txt");

        if (f.delete())
            System.out.println("File Deleted Successfully");
        else
            System.out.println("Unable to delete the file");
    }
}