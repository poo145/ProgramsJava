package construct;
public class Argument 
{
	//1.Declaration
	int x;
	int y;
	int z;
	int a;
	//2.Initialization
	
	//Non-argument/parameterized or zero argument constructor
	Argument()	
	{
		x=15;
		y=20;
		z=5;
		a=x+y+z;
		System.out.println(a);
	}
	
	//Argument/parameterized constructor
	Argument(int p,char q)	
	{
		System.out.println("this is integer " +p +"\n" +"this is character :"+q);
	}

	Argument(float p,char q)	
	{
		System.out.println("this is float " +p +"\n" +"this is character :"+q);
	}
	Argument(float p,float q)	
	{
		System.out.println("this is float " +p +"\n" +"this is float :"+q);
	}
	Argument(int p,int q)	
	{
		System.out.println("this is integer " +p +"\n" +"this is integer :"+q);
	}
	Argument(double p,int q)	
	{
		System.out.println("this is double " +p +"\n" +"this is integer :"+q);
	}
	Argument(double p,float q)	
	{
		System.out.println("this is double " +p +"\n" +"this is float :"+q);
	}
	Argument(byte p,float q)	
	{
		System.out.println("this is byte " +p +"\n" +"this is float :"+q);
	}
	//Argument(byte z)
	//{
	//	System.out.println(z);
	//}
	Argument(long L)
	{
		System.out.println(L);
	}
	Argument(short o)
	{
		System.out.println(o);
	}
	Argument(boolean z)
	{
		System.out.println(z);
	}
	Argument(int l)
	{
		System.out.println(l);
	}
	Argument(double k)
	{
		System.out.println(k);
	}
	Argument(float h)
	{
		System.out.println(h);
	}
	Argument(char z)
	{
		System.out.println(z);
	}
	//3.Usage
	public static void main(String args[])
	{
		new Argument();		//How to call in main method
		new Argument(50,'f');
		new Argument(11.5f,'A');
		new Argument(11.5f,3.5f);
		new Argument(20,30);
		new Argument(25.4,15);
		new Argument(50.9,1.5f);
		new Argument(-12,20.5f);
		//new Argument(12);
		new Argument(55324567678788999l);
		new Argument(35);
		new Argument(true);
		new Argument(45);
		new Argument(8.8f);
		new Argument(12.3);
		new Argument('P');
	}
}
