package pkg2;

public class ParentClass
{
	public ParentClass()
	{
		this(111,222,333);
		System.out.println("parent Default Constructor");
	}
	public ParentClass(int a)
	{
		this();
		System.out.println("parent one parameterized  Constructor");
	}
	public ParentClass(int a, int b)
	{
		this(111);
		System.out.println("Parent Two parameterized  Constructor");
	}
	public ParentClass(int a, int b,int c)
	{
		System.out.println("Parent Three parameterized  Constructor");
	}
	public ParentClass(int a, int b,int c, int d)
	{
		this(11,33);
		System.out.println("Parent Four parameterized  Constructor");
	}
	
	public static void main(String[] args)
	{
		
	}
}
