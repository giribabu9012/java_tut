import java.util.Scanner;
class F 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Start:");
		int start=sc.nextInt();
		System.out.print("Enter End:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%3==0 && i%5==0)
			
				System.out.print(i+":"+"FizzBuzz");
			
			else if(i%3==0)
			
				System.out.print(i+":"+"Fizz");
			
			else if(i%5==0)
			
				System.out.print(i+":"+"Buzz");
			
			else
			
				System.out.print("Invalid");
			
		}
	}
}
