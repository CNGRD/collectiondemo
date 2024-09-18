package stringClass;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ex2
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ex2()
	{
		Frame frame=new Frame("Hello first GUI");
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				frame.dispose();
			}
		});
	}
	public static void main(String[] args) 
	{
		Ex2 obj=new Ex2();
		
	}
}