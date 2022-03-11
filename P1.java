package Test1;
public class P1
{
	int length,breath;
	P1()
	{
		
	}
	P1(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	
}
public class p2 extends P1
{
	int height;
	p2(){}
	p2(int length, int breath,int height)
	{
		super(length,height);

		this.height=height;
	
	}
	void display() {
		int dis=height+length+breath;
		System.out.println("the distance is "+dis);
	}
	public static void main(String[] args)
	{
		p2 k=new p2(2,3,4);
		k.display();
	}
	}
