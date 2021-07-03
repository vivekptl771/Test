package pkg1;

public class Assignment5
{
	public void  V1(int a,int b, int c, int d)
	{
		this.V2();
		System.out.println("Four Parameterized  Method");
	}
	public void  V2()
	{
		System.out.println("Default Method");
	}
	public void  V3(int v)
	{
		this.V1(101, 102, 103, 107);
		System.out.println("One Parameterized Method");
	}
	public void  V4(int a1, int a2)
	{
		this.V5(111, 333, 777);
		System.out.println("Two Parameterized Method");
	}
	public void  V5(int p1, int p2, int p3)
	{
		this.V3(7);
		System.out.println("Three Parameterized Method");
	}
	public static void main(String[] args)
	{
		Assignment5 obj = new Assignment5();
		obj.V4(10,25);
		
	}

}
