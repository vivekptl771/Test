package pkg5;

import java.util.Scanner;

public class A4
{

	public static void main(String[] args) 
	{
		int v=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No ");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++)
		{
				for(int j=1; j<=i; j++)
				{
					System.out.print(v +" ");
					v++;
					
					
				}
				System.out.println();
	}

}
}
