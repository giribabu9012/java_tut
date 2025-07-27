class strRotated 
{
	public static void main(String[] args) 
	{
		String s1="abcde",s2="cdeab";
		s1=s1+s1;
		if(s1.contains(s2))
		{
		System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
