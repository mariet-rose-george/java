package user;

import java.util.Scanner;

public class studentClass {
    String name;
    int age;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create object of studentClass, not Student
        studentClass s1 = new studentClass();

        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter student age: ");
        s1.age = sc.nextInt();

        System.out.println("\nStudent Details:");
        s1.display();

        sc.close();
    }
}
