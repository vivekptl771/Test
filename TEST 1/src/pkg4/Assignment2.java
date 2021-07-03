package pkg4;

import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args)
	{
		int v1,v2,v3;
	    Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter the value of x and y ");
	    v1 = sc.nextInt();  
	    v2 = sc.nextInt();  
	       System.out.println("before swapping numbers: "+v1 +"  "+ v2);  
	      v1 = v1+v2;
	      v2=  v1-v2;
	      v1 = v1-v2;
	       System.out.println("After swapping: "+v1 +"   " + v2);  
	       System.out.println( );  
	}

}
