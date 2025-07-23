package user;
import java.util.Scanner;
public class grade {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your marks:");
	int marks=sc.nextInt();
	if( marks >= 90) {
		System.out.println("you are awarded with A grade");
	}
	else if(marks >=75) {
		System.out.println("you are awarded with B grade");
	}
	else if(marks >=60) {
		System.out.println("You are awarded with C grade");
	}
	else if(marks >=40) {
		System.out.println("You are awarded with D grade");
	}
	else {
		System.out.println("Sorry!!!You are failed..");
	}
	sc.close();
}
}
