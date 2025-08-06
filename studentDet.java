package user;
class Stud{
	String name;
	static int studentcount=0;
	Stud(String name){
		this.name=name;
		studentcount++;
		
	}
	public static int getstudentcoun() {
		return studentcount;
	}
}

public class studentDet {
    public static void main(String[] args) {
    	Stud student1=new Stud("achu");
    	Stud student2=new Stud("achu");
    	int total=Stud.getstudentcoun();
        
        System.out.println("the count is "+total);
    }
}
