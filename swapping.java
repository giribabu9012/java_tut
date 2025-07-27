import java.util.Arrays;
class swapping 
{
	public static void main(String[] args) 
	{
		int []a={10,20,30,40,50};
		int l=0,r=a.length-1;
		
		while(l<r)
		{
			int temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
		}
		System.out.println(Arrays.toString(a));
	}
}
