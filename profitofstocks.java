import java.util.*;
class profitofstocks 
{
	public static int stock(int[]a)
	{
		int max_profit=0;
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				int profit=a[j]-a[i];
				max_profit=Math.max(max_profit,profit);
			}
		}
		return max_profit;
	}
	public static void main(String[] args) 
	{
		int[]a={7,1,5,8,6,4};
		System.out.println(stock(a));
	}
}
