import java.util.*;
class selectionsort 
{
	public static void sel(int []a) 
	{
		for(int i=0;i<a.length;i++)
		{
			int sm=i;
			for(int j=i;j<a.length;j++)
			{
			if(a[j]<a[sm])
			 sm=j;
			int temp=a[i];
			a[i]=a[sm];
			a[sm]=temp;
			}
		}
	}
		public static void main(String []args)
			{
			int []a={5,4,1,7,3,6,-8};
			System.out.println(Arrays.toString(a));
			sel(a);
			System.out.println(Arrays.toString(a));
	}
}
