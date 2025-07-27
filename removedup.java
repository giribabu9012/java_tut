import java.util.*;
class removedup 
{
	public static boolean dup(int[]a)
	{
		Arrays.sort(a);
		for (int i=0;i<a.length ;i++ )
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int[][]a={{10,29,10,9},
			{20,20,30,40},
			{57,68,89,89},
			{80,45,67,11}};
		for (int i=0;i<a.length ;i++ )
		{
		System.out.println(dup(a[i]));
		}
	}
}
