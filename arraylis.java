package poi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


abstract class s2 
{
	public abstract void disp();
	public abstract void dsip();
	
	
}
public class arraylis extends s2
{
	public void disp()
	{
		System.out.println("Disp");
	}
	public void dsip()
	{
		System.out.println("Dsip");
	}
		
	
	public static void main(String arg[])
	{
		s3 s= new s3();
		s.disp();
		s.dsip();
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(1);
		l.add(2);
  Iterator<Integer> itr = l.iterator(); 
while(itr.hasNext())
		System.out.println(itr.next());
	}
		
		
	}