package NoPack;

import java.util.Scanner;


class P
{ 
	public static void main(String[] args)
	{int k=200,P=150,s2=0;
	 String tx="pizza";
	 System.out.println("enter any number");
	 java.util.Scanner s=new  Scanner(System.in);
	 int k3=s.nextInt();
	 for (int i=2;i<k3;i++)
	 {
		 if(k3%i==0)
		 {
	          System.out.println(k3%i);
	          s2=1;
			 break;
		 }
		 else
		 {
          System.out.println(k3%i);
			 s2=0;
		 }
	 }
	 if(s2==1)
	 {
		 System.out.println("Not Prime");
	 }
	 else
		 System.out.println("Prime");
	if(k>=P)
		System.out.println("Pizza can be bought");
	else
		System.out.println("Cant be bought");
	System.out.println(tx.toUpperCase());
	int t=java.lang.Math.max(k, P);
	System.out.println(t);
	s.close();
}}
 
