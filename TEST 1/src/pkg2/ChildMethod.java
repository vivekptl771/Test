package pkg2;

public class ChildMethod extends ParentMethod
{
	public void p1()
	{
	this.p5(11, 33, 44, 55);
	System.out.println("child  Default Method");
	}
	public void p2(int a)
	{
	this.p4(1, 3, 5);
	System.out.println("child one parameterized  Method");
	}
	public void p3(int a, int b)
	{
	this.p1();
	System.out.println("child Two parameterized  Method");
	}
	public void p4(int a, int b, int c)
	{
	this.p3(11, 33);
	System.out.println("child Three parameterized  Method");
	}
	public void p5(int a, int b, int c, int d)
	{
	super.v5(11, 33, 77, 99);
	System.out.println("child Four  parameterized  Method");
	}
	public static void main(String[] args)
	{
		
		ChildMethod c = new ChildMethod();
		c.p2(101);
	}

}
