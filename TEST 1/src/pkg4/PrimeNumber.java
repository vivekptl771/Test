package pkg4;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int i,n, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		n = sc.nextInt();	
		 i=1;
		while (i<=n)
		{
			if(n%i==0)
			count = count+1;
			i = i+1;
		}		
		if(count==2)
		{
			System.out.println("The given Number is Prime Number");
			
		}
		else
		{
			System.out.println("The given Number is Not prime Number");
		}
				
		}
		
	
}
