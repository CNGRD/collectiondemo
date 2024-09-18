package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeDriver {

	public static void main(String[] args) {
		List<Employee> e=new ArrayList<>();
		e.add(new Employee("Raj",25));
		e.add(new Employee("Ravi",28));
		e.add(new Employee("Roky",30));
		e.add(new Employee("Ramesh",20));
		e.add(new Employee("Rambo",23));
		Collections.sort(e,new Name());
		for (Employee e1 : e) 
		{
			System.out.println(e1.name);
			
		}
		System.out.println("***************");
		Collections.sort(e,new Age());
		for (Employee e1 : e) 
		{
			System.out.println(e1.age);
			
		}

	}

}
