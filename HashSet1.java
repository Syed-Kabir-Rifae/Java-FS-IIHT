package HashSet1;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		hs.add("Kabir");
		hs.add("Syed");
		System.out.println(hs.contains("Syed"));
		System.out.println(hs.size());
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs);
		hs.remove("Kabir");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs);

		
		
	}

}
