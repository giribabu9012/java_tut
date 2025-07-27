import java.util.*;
class EvenN
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("ENTER A NUMBER:");
		int a=sc.nextInt();
		int num=1;
		while(count<=a)
		{
			System.out.print((count*2)+" ");
			count++;
		}
	}
}
