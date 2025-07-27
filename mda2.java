import java.util.*;
class mda2
{
	public static int add(int num)
	{
		int temp=0;
		while(num>0)
		{
			temp=temp+num%10;
			num=num/10;
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		int [][]a={{714,214,117},
					{213,741,475},
					{711,174,247}};
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(add(a[i][j])+" ");
			}
			System.out.println();
		}
	int maximum=Integer.MIN_VALUE;
	int minimum=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		for (int j=0;j<a[i].length ;j++ )
		{
			maximum=Math.max(add(a[i][j]),maximum);
			minimum=Math.min(add(a[i][j]),minimum);
		}
	}
		System.out.println("first Maximum:" +maximum);
		System.out.println("Last Minimum:" +minimum);
	}
}
