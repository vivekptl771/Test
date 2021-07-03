package pkg1;

public class Student 
{
	int roll_no;
	int age;
	public void display1()
	{
		System.out.println("Welcome To All Of You");
		
	}
	public void display2() 
	{
		System.out.println("Automation is very easy");
		
	}
	public static void main(String[] args)

	{
		Student vivek = new Student();
		vivek.display1();
		vivek.display2();
		vivek.roll_no = 7;
		System.out.println(vivek.roll_no);
		vivek.age = 24;
		System.out.println(vivek.age);
		
		
	}
	
	
}
