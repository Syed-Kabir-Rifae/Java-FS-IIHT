package IOE;
import java.io.*;
import java.util.*;

public class IOE {

	public static void main(String[] args) {
		int i,j,k;
		Scanner s =new Scanner(System.in);
		i=s.nextInt();
		j=s.nextInt();
		
try {
	k=i/j;
	System.out.println(k);
	try
	{
		k=i*j;
		System.out.println(k);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally {
		System.out.println("Finally");

	}


}
catch(ArithmeticException a )
{
	System.out.println(a);

}

catch(Exception e)
{
	System.out.println(e);
}
	}

}
