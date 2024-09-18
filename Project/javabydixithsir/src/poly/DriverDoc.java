package poly;

import javax.print.Doc;

public class DriverDoc {

	public static void main(String[] args) {
		GDoc[] d=new GDoc[3];
		System.out.println("****************************");
		d[0]=new GDoc();
		d[1]=new CardioDoc();
		d[2]=new NeoroDoc();
		for(int i=0;i<d.length;i++)
		{
			d[i].treatment();
		}
		System.out.println("*********************************");

	}

}
