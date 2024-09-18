package arrays;
import java.util.Scanner;
class HighestInArray {
	public static void main(String []  args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println("enetered element @ index "+i+" is: " +arr[i]);
		}
		int highest = arr[0];
		System.out.println("Highest element is :");
		for (int i = 0; i < arr.length; i++) {
			if(highest < arr[i])
			{
				highest = arr[i];
			}
		}
		System.out.println(highest);
	}
	

}
