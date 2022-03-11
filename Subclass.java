package newpack;
class Superclas
{
void getage()
{  int age=44;
	System.out.println(age);
}}
class Subclass extends Superclas
{
 void getage()
 {
	 long age= 23;
	 System.out.println(age);
 }
	public static void main(String[] args)
{
	Superclas s;
	s= new Subclass();
	s.getage();
	
}
}

