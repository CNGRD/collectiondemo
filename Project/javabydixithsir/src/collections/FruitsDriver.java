package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FruitsDriver {

	public static void main(String[] args) {
		List<Fruits> a=new ArrayList<>();
		a.add(new Fruits("Yellow",50));
		a.add(new Fruits("Black",100));
		a.add(new Fruits("Green",150));
		a.add(new Fruits("Red",250));
		a.add(new Fruits("Gray",350));
		Collections.sort(a);
		for (Fruits f : a) 
		{
			System.out.println(f.color+"<==>"+f.price);
		}
	}

}
