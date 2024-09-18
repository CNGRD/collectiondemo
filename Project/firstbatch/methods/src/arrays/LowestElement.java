package arrays;
import java.util.Scanner;
class LowestElement {
	public static void main(String []  args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[7];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println("enetered element @ index "+i+" is: " +arr[i]);
		}
		int min = arr[0];
		System.out.println("Lowest2 element is :");
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	

}
