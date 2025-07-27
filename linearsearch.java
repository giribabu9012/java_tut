import java.util.*;
class linearsearch 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean lin(int[]a,int b) 
	{
		for (int i=0;i<a.length;i++)
		{
		if(a[i]==b)
		{
			return true;
		}
	}
	return false;
	}
	public static void main(String []args)
	{
		int []a={10,20,30,40,50,60};
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		System.out.println("a"+Arrays.toString(a));
		System.out.println(lin(a,b)? "present":"not present");
	}
}
