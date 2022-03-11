package Abs;
abstract class Abs1
{
	abstract void disp();
	void add(int i,int j)
	{
		System.out.println(i+j);
	}
	
}
 class Abs2 extends Abs1
{
	public static void main(String arg[])
	{
		Abs1 a= new Abs2();
		a.add(2,3);
		
	}


}