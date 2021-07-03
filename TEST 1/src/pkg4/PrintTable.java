package pkg4;

import java.util.Scanner;

public class PrintTable
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to print  \n");
		n = sc.nextInt();
		for(i=1; i<=10;i++)
			System.out.println(n +"*"+ i+"="+(n*i));
			
		
		
	}
}
