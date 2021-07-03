package pkg1;

public class Assignment2
{
	public int sum(int s1, int s2)
	{
		int s3 = s1+s2;
		System.out.println("The  result of sum  is  "  +s3);
		return s3;
	}
	public int sub(int a1, int a2)
	{
		int a3= a1-a2;
		System.out.println("The reult of sub is    "   +a3);
		return a3;
	}
	public int mul(int m1 , int m2)
	{
		int m3= m1*m2; 
		System.out.println("The result of mul is   "   +m3);
		return m3;
	}
	public void  div(int d1,int d2)
	{
		int d3= d1/d2;
		System.out.println("The  Final  result  is  "  +d3);
		
	}
	public static void main(String[] args)
	{
		Assignment2 v1 = new Assignment2 ();
		{
			int sum = v1.sum(10,2);
			int sum1 = v1.sum(sum,2);
			int sub = v1.sub(sum1, 2);
			int mul = v1.mul(sub, 2);
			v1.div(mul, 2);
			
		}
	}
	

}
