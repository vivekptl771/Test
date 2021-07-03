package pkg1;

public class Assignment4 
{
	public Assignment4(int a , int b, int c)
	{
		System.out.println("Three parameterized constructor");
	}
	public Assignment4()
	{
		this(111,333,777);
 		System.out.println("Default parameterized constructor");
	}
	public Assignment4(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	
     public Assignment4(int a , int b, int c, int d)
	{
		this(101);
		System.out.println("Four parameterized constructor");
	}
     public Assignment4(int a, int b)
 	{
 		this(17,77,33,99);
 		System.out.println("Two parameterized constructor");
 	}
	public static void main(String[] args)
	{
		Assignment4 obj   = new Assignment4(11,22);
		
	}

}
