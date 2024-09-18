package collections;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class SortAsc {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Husky");
		l.add("BullDog");
		l.add("German");
		l.add("Abibus"); 
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}

}
