import java.util.Arrays;
class zigzag 
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5};
		int []b={6,7,8,9,10};
		int []c=new int[a.length+b.length];
		int d=0;
		for(int i=0;i<a.length;i++)
		{
			c[d++]=a[i];
			c[d++]=b[i];
		}
		System.out.print(Arrays.toString(c));
	}
}
