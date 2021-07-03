package pkg4;

import java.util.Scanner;

public class ArmstrongNumber
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number \n");
		n = sc.nextInt();
		int temp = n;
		int r=0;
		int sum=0;
		while(n>0)
		{
			r= n%10;
			sum= sum+(r*r*r);
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("The Number is Armstrong");
			
		}
		else
		{
			System.out.println("The Number is Not Armstrong");
		}
		
		
	}
}
