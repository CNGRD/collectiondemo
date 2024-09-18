package wrapper_class_Programs;

public class Student 
{
	public static void main(String[] args) {
	//Implicit Boxing 
		//AutoBoxing
	int stdrollno=9;
	Integer i=stdrollno;
	System.out.println(i);//implicit to toString()
	System.out.println(i.equals(i));
	System.out.println(i.hashCode());
	
	Character gender='f';
	System.out.println(gender);
	
	Double per=85.9;
	System.out.println(per);
	
	Boolean result=true;
	System.out.println(result);
	
	System.out.println("************************");
	
	
	
	//Implicit Unboxing
	//Autounboxing
	int i1=i;
	System.out.println(i1);
	
	char c1=gender;
	System.out.println(c1);
	
	double d1=per;
	System.out.println(d1);
	
	boolean b=result;
	System.out.println(b);
	}

}
