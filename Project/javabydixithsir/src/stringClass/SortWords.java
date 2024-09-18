package stringClass;

import java.util.Iterator;


public class SortWords {

	public static void main(String[] args) {
		String arr[]= {"xyz","abcv","lmn","aba"};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				char ch1[]=arr[i].toCharArray();
				char ch2[]=arr[j].toCharArray();
				int length=ch1.length>ch2.length?ch2.length:ch1.length;
				int k=0;
				while (k<length) 
				{
					if (ch1[k]>ch2[k]) 
					{
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
					k++;
				}
			}
			
		}
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
