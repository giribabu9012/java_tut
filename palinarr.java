import java.util.Arrays;
class palinarr 
{
	public static void main(String[] args) 
	{
		int [] a={12,121,13,141,181};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(palindrome(a[i]))
			{
				count++;
				a[i]= -1;
			}
			System.out.print(count);
		}
	}
		public static boolean palindrome(int a)
		{
			int temp=a;
			int rev=0;
			while(a>0)
			{
			int last=a%10;
			rev=(rev*10)+last;
			a=a/10;
			}
			return rev==temp;
	}
}
