import java.util.*;
class strcount
{
	public static void main(String[] args) 
	{
		String s="java sql testing java sql java";
		String[] a=s.split(" ");
		for (int i=0;i<a.length;i++ )
		{
			int count=1;
			if(a[i].equals(" "))
			continue;
			for (int j=i+1;j<a.length ;j++ )
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]=" ";
				}
			}
		System.out.println(a[i]+":"+count);
		}
	}
}
