package methods;
import java.util.Scanner;
public class Car1 {
	public static double distance1=200.0;
	public static double time1=2.0;
	public double speed1=120;
	
	public double distance() {
		Car1 c=new Car1();
		distance1 = c.speed1*time1;
		return distance1;
	}
	public static double time() {
		Car1  c=new Car1();
		time1 = distance1/c.speed1;
		return time1;
	}
	public static double speed() {
		Car1 c=new Car1();
		c.speed1 =distance1/time1;
		return c.speed1;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("press 1 for speed");
		System.out.println("press 2 for time");
		System.out.println("press 3 for distance");
		int a = sc.nextInt();
		switch (a) {
		case 1: double res=speed();
				System.out.println("Speed of the Car :"+res+" kmph");
				break;
		case 2: double res1=time();
				System.out.println("Time taken by the Car :"+res1+" hour");
				break;
		case 3: Car1 c=new Car1();
				double res2=c.distance();
				System.out.println("Distance travelled by the Car :"+res2+" km");
				break;
				
			
		default:System.out.println("Enter valid choice");
			
		}
		

	}

}
