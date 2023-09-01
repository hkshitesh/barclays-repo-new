package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}	
	public int newSum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public static void main(String[] args) {		
		MyCalculator ob = new MyCalculator();
		System.out.println("Sum is : "+ob.sum(20, 10));
		System.out.println("Diff is : "+ob.diff(20, 10));
		System.out.println("New Sum is: "+ob.newSum(30, 10));
	}
}
