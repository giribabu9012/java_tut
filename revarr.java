import java.util.Arrays;
class revarr
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5};
		int [] rev=new int[a.length];
		int m=0;
		for(int i=a.length-1;i>=0;i--)
		{
			rev[m++]=a[i];
		}
		System.out.println(Arrays.toString(rev));
	}
}
