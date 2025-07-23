package user;

public class odd {
	public static void main(String[] args) {
System.out.println("Odd numbers form 0 upto 50: ");
for(int i=1;i<50;i++) {
	if(i%2==0)
	{
		continue;
	}
	System.out.println("the numbers are " +i);
}
}
}