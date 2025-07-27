import java.util.*;
class mda4 
{
	public static void rev(int[]a)
	{
	int l=0,r=a.length-1;
	//int temp=0;
	while(l<r)
	{
		int temp=a[l];
		a[l]=a[r];
		a[r]=temp;
		l++;
		r--;
	}
	}
	public static void main(String[] args) 
	{
		int[][]a={
			{10,20,30},
			{40,50,60},
			{70,80,90}};
		for (int i=0;i<a.length ;i++ )
		{
			rev(a[i]);
		System.out.println(Arrays.toString(a[i]));
		}
	}
}
