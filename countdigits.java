import java.util.*;
class countdigits
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int count=0;
		//int num=0;
		if(num==0)
			{
			System.out.println("Digits");
			}
		else
		{
			while(num>0)
			{
				num=num/10;
				count++;
			}
			System.out.println("Digitsofcount="+count);
		}
	}
}
