package PrintWriter1;
import java.io.PrintWriter;
import java.io.File;

public class PrintWriter1 {

	public static void main(String[] args) {
		PrintWriter p=new PrintWriter(System.out);
		p.println("Hey there");
		p.flush();
		p.close();
		PrintWriter p2 = null;
		try{
		p2=new PrintWriter(new File("C:\\tet.txt"));
		p2.write("KAbir");
		p2.flush();
		p2.close();
	}
		catch( Exception e)
		{
			System.out.println("File Not FOund");
		}

	}


}

