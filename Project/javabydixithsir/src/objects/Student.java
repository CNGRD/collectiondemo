package objects;

public class Student 
{
	int sid;
	String sname;
	int age;
	Student()
	{
		
	}
	Student(int sid)
	{
		this.sid=sid;
		System.out.println("Student1 id:"+sid);
	}
	Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
		System.out.println("Student2 id:"+sid);
		System.out.println("Student2 Name:"+sname);
	}
	Student(int sid,String sname,int age)
	{
		this.sid=sid;
		this.sname=sname;
		this.age=age;
		System.out.println("Student3 id:"+sid);
		System.out.println("Student3 Name:"+sname);
		System.out.println("Student3 Age:"+age);
	}

}
