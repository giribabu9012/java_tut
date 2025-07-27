import java.util.*;
class maxofsubarray 
{
	public static void max(int []a) 
	{
		int maximum=Integer.MIN_VALUE;
		int cur_sum=o;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				cur_sum=cur_sum+a[i];
				maximum=Math.max(cur_sum,maximum);
			}
			cur_sum=0;
		}
		return maximum;
		public static void main(string []args)
		{
			int[]a={-2,6,8,-10};
		System.out.println(max(a));
		}
	}
}