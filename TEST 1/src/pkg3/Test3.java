package pkg3;

import java.util.Scanner;

public class Test3
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
		System.out.println("Enter the value of p1");
		int p1 = sc.nextInt();
		System.out.println("Enter the value of p2");
		int p2 = sc.nextInt();
		System.out.println("Enter the value of p3");
		int p3 = sc.nextInt();
		System.out.println("Enter the value of p4");
		int p4 = sc.nextInt();
		System.out.println("Enter the value of p5");
		int p5 = sc.nextInt();
		System.out.println("Enter the value of p6");
		int p6 = sc.nextInt();
		
		Test1 t = new Test1 ();
		int x= t.mul(p1, p2);
		int y = t.sub(x, p3);
		int z = t.sum(y, p4);
		int m = t.sub(z, p5);
		int n  = t.div(m, p6);
		
		System.out.println("Result is " +n) ;
		
  }
}

