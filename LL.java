package LL;
import java.util.*;

public class LL {

	public static void main(String[] args) {
     LinkedList ll=new LinkedList();
     ll.add("ks");
     ll.add(23);
     ll.add("Kabir");
     System.out.println(ll);
     Iterator itr= ll.iterator();
     while(itr.hasNext())
     {
         System.out.println(itr.next());

     }
	}

}
