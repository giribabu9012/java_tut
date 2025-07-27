import java.util.*;
class strashrem
{
	public static void main(String[] args) 
	{
		String s="abc#de##*f";
		char []a=s.toCharArray();
		for (int i=0;i<a.length;i++ )
		{
			if(a[i]>='a' && a[i]<='z')
				a[i-1]= 0;
		}
		System.out.println(" ");
	}
}
