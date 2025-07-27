import java.util.*;
class missing 
{
	public static int[] Missing(int [] a) 
	{
		int b=1;
		int c=10;
		for (int i=0;i<a.length ;i++)
		{
			for (int j=0;j<=c;j++)
			{
				if (i==j)
				{
					j=Integer.MIN_VALUE;
				}
			}
		}
		int res [] = new int [a.length];
		for (int j=0;j<=10 ;j++ )
		{
		
		if (j!=Integer.MIN_VALUE)
		{
			System.out.print(j+" ");
		}
		}
		return res;
	}
	public static void main (String[]args)
	{
		int a[]={1,2,5,7,10};
	System.out.print(Arrays.toString(a));
	int res[]=Missing(a);
	System.out.print(Arrays.toString(res));
	}
}
