import java.util.Arrays;
class revarr1 
{
	public static void main(String[] args) 
	{
		int []a={21,32,54,76,98};
		int [] rev=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			rev[i]=reverse(a[i]);
		}
		System.out.println(Arrays.toString(rev));
	}
	public static int reverse(int a)
	{
		int rev=0;
		while(a>0)
		{
		int last=a%10;
		rev=(rev*10)+last;
		a=a/10;
		}
	return rev;
	}
}
