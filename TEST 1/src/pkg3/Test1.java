package pkg3;

import java.util.Scanner;

public class Test1
{
	public int sum(int a, int b)
	{
		return a+b;
		
	}
	public int sub(int a, int b)
	{
		return a-b;
		
	}
	public int mul(int a, int b)
	{
		return a*b;
		
	}
	public int div(int a, int b)
	{
		return a/b;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of v1");
		int v1 = sc.nextInt();
		System.out.println("Enter the value of v2");
		int v2 = sc.nextInt();
		System.out.println("Enter the value of v3");
		int v3 = sc.nextInt();
		System.out.println("Enter the value of v4");
		int v4 = sc.nextInt();
		System.out.println("Enter the value of v5");
		int v5 = sc.nextInt();
		System.out.println("Enter the value of v6");
		int v6 = sc.nextInt();
		
		Test1 t = new Test1 ();
		int a = t.mul(v1,v2);
		int b=  t.sum(a, v3);
		int c=  t.sum(b, v4);
		int d=  t.sub(c,v5);
		int e = t.div(d, v6);
		
		System.out.println("Result is " +e);
		
				
	}
}
