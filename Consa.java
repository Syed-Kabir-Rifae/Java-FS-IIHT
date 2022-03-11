package Cons;
class Cons
{ 
	int i,j,k=0;
	Cons()
	{}
	Cons(int i,int j)
	{
		this.i=i;
		this.j=j;
	 k=this.i+this.j;
	}
void disp()
{
	System.out.println("Sum is "+(k));
}
}
class Consa extends Cons
{
	Consa()
	{
		
	
	}
Consa(int i,int j)
{
	super(i,j);
}

public static void main(String arg[])
{
	Consa a =new Consa(2,4);
	a.disp();
	
}
}

