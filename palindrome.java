import java.util.Scanner;
class palindrome 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
