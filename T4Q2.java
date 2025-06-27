import java.io.*;
import java.util.*;

public class T4Q2 {

    static class Student {
        String name;
        int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void saveToFile(String filename) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                writer.write(this.name + "," + this.age);
                writer.newLine();
            } catch (IOException e) {
                System.out.println("An error occurred while saving student details.");
                e.printStackTrace();
            }
        }
        public static void retrieveFromFile(String filename) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] details = line.split(",");
                    String name = details[0];
                    int age = Integer.parseInt(details[1]);
                    System.out.println("Name: " + name + ", Age: " + age);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while retrieving student details.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "students.txt";

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    Student student = new Student(name, age);
                    student.saveToFile(filename);
                    System.out.println("Student details saved successfully.");
                    break;

                case 2:
                    System.out.println("Retrieving student details...");
                    Student.retrieveFromFile(filename);
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
