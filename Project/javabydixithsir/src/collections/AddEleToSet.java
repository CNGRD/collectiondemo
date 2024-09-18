package collections;
import java.util.Set;
import java.util.HashSet;
public class AddEleToSet {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Doraemon");
		s.add("Naruto");
		s.add("Tom&Jerry");
		s.add("Naruto");
		System.out.println(s);

	}

}
