import java.util.Arrays;
class anagram 
{
	public static void main(String[] args) 
	{
		String s1="Race";
		String s2="Care";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.trim();
		s2=s2.trim();
		char[]a=s1.toCharArray();
		char[]b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length!=b.length)
		{
			System.out.println("Not a anagram");
		}
		String c=new String(a);
		String d=new String(b);
		if(c.equals(d))
		{
		System.out.println("Its a Anagram");
		}
		else
		{
			System.out.println("Its not a Anagram");
		}
	}
}
