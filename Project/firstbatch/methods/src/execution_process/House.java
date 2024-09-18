package execution_process;

public class House 
{
    public int noOfRooms=20;
    public static int cupboard=10;
    
    public static void room()
    {
    	House h=new House();
    	System.out.println("No of rooms are: "+h.noOfRooms);
    }
    public void kitchen()
    {
    	System.out.println("No of cupboard are: "+cupboard);
    }
	
    public static void main(String[] args) 
	{
		room();
		House h1=new House();
		h1.kitchen();

	}

}
