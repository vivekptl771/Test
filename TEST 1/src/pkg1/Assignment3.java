package pkg1;

public class Assignment3 
{
	public int div(int d1, int d2)
	{
		int d3 = d1/d2;
		System.out.println("The  result of div  is  "  +d3);
		return d3;
	}
	public int sub(int s1, int s2)
	{
		int s3= s1-s2;
		System.out.println("The reult of sub is    "   +s3);
		return s3;
	}
	public int sum(int a1 , int a2)
	{
		int a3= a1+a2; 
		System.out.println("The result of sum is   "   +a3);
		return a3;
	}
	public void  mul(int m1,int m2)
	{
		int m3= m1*m2;
		System.out.println("The  Final  result  is  "  +m3);
		
	}
	public static void main(String[] args)
	{
		Assignment3 v1 = new Assignment3 ();
		{
			int div = v1.div(10,2);
			int sub1 = v1.sub(div,2);
			int sub = v1.sub(sub1, 2);
			int sum = v1.sum(sub, 2);
			v1.mul(sum, 2);
			
					
		}
	}
	
	

}
