package pkg2;

public class ChildClass extends ParentClass
{

	public ChildClass()
	{
		this(11,33,66,99);
		System.out.println("Child default constructor");
	}
	public ChildClass(int a)
	{
		this(11,33,55);
		System.out.println("Child one parameterized constructor");
	}
	public ChildClass(int a, int b)
	{
		this();
		System.out.println("Child Two parameterized constructor");
	}
	public ChildClass(int a, int b, int c)
	{
		this(11,33);
		System.out.println("Child Three parameterized constructor");
	}
	public ChildClass(int a, int b, int c,int d)
	{
		super(11,33,77,99);
		System.out.println("Child Four parameterized constructor");
	}
	public static void main(String[] args)
	{
		ChildClass c = new ChildClass(101);
	}
}
