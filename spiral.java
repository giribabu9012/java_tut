import java.util.*;
class spiral 
{
	public static void main(String[] args) 
	{
		int [][]a={
			{1,2,3,4,5},
			{16,17,18,19,6},
			{15,24,25,20,7},
			{14,23,22,21,8},
			{13,12,11,10,9}
		};
		spi(a);
	}
	public static void spi(int[][]a)
	{
		int left=0,right=a.length-1,top=0,bottom=a.length-1;
		while(left<=right && top<=bottom)
		{
		for (int i=left;i<=right ;i++ )
		{
			System.out.println(a[top][i]+" ");
		}
		top++;
		for (int i=top;i<=bottom ;i++ )
		{
			System.out.println(a[i][right]+" ");
		}
		right--;
		for(int i=right;i>=left;i--)
			{
			System.out.println(a[bottom][i]+" ");
			}
			bottom--;
			for(int i=bottom;i>=top;i++)
			{
				System.out.println(a[left][i]+"");
			}
			left++;
		}
	}
}
