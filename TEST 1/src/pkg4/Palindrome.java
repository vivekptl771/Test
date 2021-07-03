package pkg4;

import java.util.Scanner;

public class Palindrome
{
public static void main(String[] args)

{
	Scanner sc = new Scanner(System.in);
	int n, rev =0 ,v1;
	System.out.println("Enter the Number:  \n ");
	n= sc.nextInt();
	v1 = n;
	while(n>0)
	{
		rev = (rev*10)+n%10;
		n = n/10;
		}
	if (rev==v1)
	{
		System.out.println("The given number is palindrome Number");
	
	}
	else 
	{
		System.out.println("The given number is not palindrome Number");
	}
		
  }
}

