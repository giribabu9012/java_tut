import java.util.*;
class pangram 
{
	public static boolean pan(String s)
	{
		s=s.toUpperCase();
		boolean []a=new boolean[26];
		char[] b=s.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=' ')
				a[b[i]-65]=true;
		}
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]==false)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String s="The quick brown fox jumps over the lazy dog";
		if(pan(s))
			System.out.println("Yes It is pangram");
		else 
			System.out.println("No its not pangram");
	}
}
