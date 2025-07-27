import java.util.Scanner;
class Primeornot 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean is_prime=true;
		if(num==1||num==0)
		{
			System.out.println(":is a prime number"+num);
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				is_prime=false;
				break;
			}
		}
		if(is_prime)
			System.out.print(":is a prime");
		else
			System.out.print(":is not a prime");
	}
}
