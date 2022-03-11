package EnumVec;
import java.util.Enumeration;
import java.util.Vector;

public class EnumVect {
	Enumeration enume;
	Vector<String> vc=new Vector<String>();

	public static void main(String[] args) {
		Enumeration enume;
		Vector<String> vc=new Vector<String>();
		vc.add("Kabir");
		vc.add("Syed");
		vc.add("Shahina");
		enume=vc.elements();
		while(enume.hasMoreElements())
		{
			System.out.println(enume.nextElement());
		}


	}

}
