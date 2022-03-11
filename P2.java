package Te;
class P1
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
public class P2 extends P1
{
	int height;
	P2(){}
	P2(int length, int breath,int height)
	{
		super(length,breath);

		this.height=height;
	
	}
	void display() {
		int dis=height+length+breath;
		System.out.println("the distance is "+dis);
	}
	public static void main(String[] args)
	{
		P2 k=new P2(2,3,4);
		k.display();
	}
	}
