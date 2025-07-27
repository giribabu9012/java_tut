import java.util.Scanner;
class tables 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		for(int i=1;i<=12;i++)
		{
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}
}
