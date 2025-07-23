package user;

import java.util.Scanner;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Employee 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("\nEnter details for Employee 2:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();
        
        Employee emp1 = new Employee(name1, id1, salary1);
        Employee emp2 = new Employee(name2, id2, salary2);

        System.out.println("\nEmployee Details:");
        emp1.displayEmployee();
        emp2.displayEmployee();

        sc.close();
    }
}
