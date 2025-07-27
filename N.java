import java.util.*;
class N
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("ENTER A NUMBERS:");
		int num=sc.nextInt();
		//int count=0//;
		while(num>=1)
		{
			System.out.print(num +" ");
			num--;
			Thread.sleep(200);
		}
	}
}
