package execution_process;

public class StudentInClass {
	public static int fans=2;
	public int student=30;
	public void Students() {
		System.out.println("how many student in clas = "+ student);
		System.out.println("how many fans in class room = " +fans);
	}
	public void chairs() {
		int ch=50;
	System.out.println("how many Chairs in class room = "+ch);
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		double a=2.7;
		System.out.println("a= " +a);
		StudentInClass d=new StudentInClass();
		d.Students();
		
		d.chairs();
		System.out.println("Main Ends");
		
	}

}
