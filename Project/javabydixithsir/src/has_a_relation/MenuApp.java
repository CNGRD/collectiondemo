package has_a_relation;
import java.util.Scanner;

class MenuApp {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//menu object in main method
		Menu m=new Menu();
		int ch;
		do
		{
			System.out.println("***WELCOME TO MENU APP***");
			System.out.println("Enter 1 to Add Dish:");
			System.out.println("Enter 2 to search Dish:");
			System.out.println("Enter 3 to Get Dish:");
			System.out.println("Enter 4 for Exit:");
			ch=s.nextInt();
			switch(ch)
			{
						//add dish
				case 1:System.out.println("Enter the Dish Name:");
						String name=s.next();
						System.out.println("Enter the Price of Dish");
						double price=s.nextDouble();
						m.addDish(new Dish(name,price));
						System.out.println("Dish added successfully");
						break;
						//search dish
				case 2:System.out.println("Enter the Dish Name to search");
						String sname=s.next();
						if(m.searchDish(sname))
						{
							System.out.println("Dish Available");
						}
						else
						{
							System.out.println("Dish Not Available");
						}
						break;
						//get Dish
				case 3:System.out.println("Enter Dish Name");
						String ename=s.next();
						if(m.searchDish(ename))
						{
							Dish dishes=m.getDish(ename);
							//Print name and price
							System.out.println("Name "+dishes.getDname());
							System.out.println("Price "+dishes.getPrice());
						}
						else
						{
							System.out.println("Dish not available Sorry!!!");
						}
						break;
				case 4:System.out.println("*****Thank You*****");
						break;
				default:System.out.println("Inavalid Input");
				break;
			}
		
		}while(ch!=4);
		System.out.println("*****Visit Again*******");
	}

}
