package poly;

public class ShapeDriver {

	public static void main(String[] args) {
		Shape[] s=new Shape[3];
		s[0]=new Shape();
		s[1]=new Circle();
		s[2]=new Triangle();
		for(int i=0;i<s.length;i++)
		{
			s[i].area();
		}

	}

}
