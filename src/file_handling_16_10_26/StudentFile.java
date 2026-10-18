package file_handling_16_10_26;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFile {
    Scanner scan = new Scanner(System.in);

    //    1
    public void createFile() throws IOException {
        File std = new File("student.txt");
        if (std.createNewFile()) {
            System.out.println(std.getName() + " is created.");
        } else {
            System.out.println("File already exists.");
        }
    }

    //    2
    public void writeFile() {
        try (FileWriter writer = new FileWriter("student.txt",true)) {
            System.out.print("Enter text:");
            writer.append(scan.nextLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        StudentFile s1 = new StudentFile();
        s1.createFile();
        s1.writeFile();
    }
}
