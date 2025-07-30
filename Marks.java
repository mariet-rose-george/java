package user;
class Student{
	int rollNo;
	String name;
	int m1,m2,m3;
	float avg;
Student(int rollNo,String name,int m1,int m2,int m3){
	this.rollNo=rollNo;
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}
public void calculateAverage() {
	avg=(m1+m2+m3)/3;
	System.out.println("Average is"+avg);
}
public void displayDetails() {
	System.out.println("Name is:"+name);
	System.out.println("Roll number is:"+rollNo);
	System.out.println("Marks:\nMark 1: " + m1 + "\nMark 2: " + m2 + "\nMark 3: " + m3);
}
}
public class Marks{
	public static void main(String [] args) {
		Student student1=new Student(20,"AMMU",56,60,59);
	student1.displayDetails();
	student1.calculateAverage();
	    Student student2=new Student(30,"ACHU",49,38,54);
	student2.displayDetails();    
	student2.calculateAverage();
	}
}

