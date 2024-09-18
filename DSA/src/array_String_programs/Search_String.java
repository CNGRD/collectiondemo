package array_String_programs;

public class Search_String {

	public static void main(String[] args) 
	{
		String[] str= {"Mango","Orange","Papaya"};
		String key="Mango";
		for(int i=0;i<=str.length-1;i++)
		{
			if(str[i]==key)
			{
				System.out.println("Key available at :"+i);
			}
		}
		if(false)
		{
			System.out.println("Not found");
		}

	}

}
