class frequency 
{
	public static void main(String[] args) 
	{
		String s="hello";
		char[] a= s.toCharArray();
		int count =1;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==' ')
				continue;
						for (int j=i+1;j<a.length ;j++ )
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=' ';
				}
			}
		System.out.println(a[i]+":"+count);	
		count =1;
		}
		
	}
}
