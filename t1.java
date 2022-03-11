package Nka;
class t1 extends Thread
{
	public static int p=0,k=1;
	public void run()
	{
		
		for(int i=0;i<=5;i++)
		{
		      System.out.println(i);

		}}
	public static void main(String arg[])
	{ 
    t1 t=new t1();
    t1 t2=new t1();
    t.start();
      t2.start();
       try {
    	   
       t.join();
       }
     
       catch(Exception e) {
      System.out.println("e");
       }
      
	}



}