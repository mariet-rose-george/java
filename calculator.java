package user;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

       
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

       
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = 0;

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;  
                else {
                    System.out.println("Error: Cannot divide by zero.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }

        
        System.out.println("Result: " + result);

        sc.close();
    }
}
