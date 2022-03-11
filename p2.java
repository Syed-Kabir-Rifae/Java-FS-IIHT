package intt;
interface P1 
{
	public void dis1();
	public void disp();
}
class p2 implements P1
{
	public void dis1()
	{
		System.out.println("Hy");
	}
	public void disp()
	{
		System.out.println("Byw");
	}
public static void main(String arg[])
{
	p2 p=new p2();
	p.dis1();
	p.disp();
	
}
}
