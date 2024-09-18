package exceptions;
import java.util.Scanner;
public class TestEmployee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your EmpId");
		String eid=s.next();
		System.out.println("Enter Your Name ");
		String ename=s.next();
		System.out.println("Enter your Salary");
		double sal=s.nextDouble();
		try {
			Employee e=new Employee(eid,ename,sal);
			System.out.println("*******EMP DETAILS********");
			System.out.println("Eid:"+e.getEid());
			System.out.println("Ename:"+e.getName());
			System.out.println("Salary:"+e.getSal());
		}
		catch ( SalaryException e ) {
			System.out.println(e.getMessage() );
		}
		
		
				
	}

}
