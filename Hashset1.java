package Hashset1;
import java.util.HashMap;

public class Hashset1 {

	public static void main(String[] args) {
     HashMap hs =new HashMap();
     HashMap h =new HashMap();

     hs.put(2929, "hs");
     hs.put(3290, "Syed");
     hs.put(9339, "Kasdhsad");
     h.put(102, "loki");
     h.put(105, "hulk");
     h.put(210, "spidy");
     System.out.println(hs.values());
     System.out.println(hs.keySet());
     hs.putAll(h);
     System.out.println(hs.keySet());
     h.putIfAbsent(20202, "Kabir");
     System.out.println(hs.containsValue("hulk"));
     System.out.println(hs.containsKey(2929));
     System.out.println(hs.putIfAbsent(29292,"hs2"));
     System.out.println(hs.entrySet());


     
     
     
	}

}
