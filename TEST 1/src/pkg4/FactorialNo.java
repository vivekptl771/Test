package pkg4;

import java.util.Scanner;

public class FactorialNo
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number \n");
		num = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
			
		}
		
		System.out.println("The Factorial number is " +fact);
		
			
	}

}
