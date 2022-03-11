package coll;
import java.util.LinkedList;
import java.util.Iterator;
class coll

{
	public static void main(String arg[])

{
	LinkedList ll=new LinkedList();
	ll.add("Kabir");
	ll.add(45);
	Iterator itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
		}}
