package has_a_relation;

public class Menu 
{
	//achieve has_a relation with Dish
	//relationship type 1 to many
	//create array of dish
	private Dish[] dishes=new Dish[10];
	//getter
	Dish[] getDishes()
	{
		return dishes;
	}
	//a variable which act as an index for insertion of dish into dishes
	int index=0;
	//a method to add a dish
	void addDish(Dish dish)
	{
		dishes[index++]=dish;
	}
	//to search whether a dish exist in the menu
	boolean searchDish(String dName)
	{
		//should compare name with every dish objects name
		for(int i=0;i<dishes.length;i++)
		{
			if(dishes[i]!=null && dName.equals(dishes[i].getDname()))
			{
				return true;
			}
		}//end of for
		return false;
	}
	Dish getDish(String name)
	{
		for(int i=0;i<dishes.length;i++)
		{
			if(name.equals(dishes[i].getDname()))
			{
				return dishes[i];
			}
		}
		return null;
	}
}
