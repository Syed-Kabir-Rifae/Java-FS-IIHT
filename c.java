package Kabi;
interface i2
{
	void displ();
	
}
class c implements i2
{
	public void displ()
	{
		System.out.print("Hey Ram");
	}
	public static void main(String arg[])
	{
		c c1 =new c();
		c1.displ();
		
	}
}