package pkg2;

public class ParentMethod
{
	public void v1()
	{
		
	this.v4(11, 33, 77);
	System.out.println("parent Default Method");
	}
	public void v2(int a)
	{
	this.v1();
	System.out.println("parent one parameterized  Method");
	}
	public void v3(int a, int b)
	{

	this.v2(333);
	System.out.println("parent Two parameterized  Method");
	}
	public void v4(int a, int b, int c)
	{

	System.out.println("parent Three parameterized  Method");
	}
	public void v5(int a, int b, int c, int d)
	{
	this.v3(11, 33);

	System.out.println("parent Four  parameterized  Method");
	}


	
}
