import java.util.Scanner;
class evenarray 
{
	public static void main(String[] args) 
	{
		//static Scanner sc=new Scanner(System.in);
		int []a={12,11,14,33,55,66,88,10};
		//int a=sc.nextInt();
		for( int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
		System.out.println("Enter"+i+"index of even element");
			}
			else
			{
		System.out.println(i  +"is not a even element");
			}
		}
	}
}
