class target 
{
	public static void main(String[] args) 
	{
		int a[]={7,5,3,8,5};
		int target=12;
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;i++)
				if(a[i]+a[j]==target)
			{
				System.out.println(a[i]+":"+a[j]);
			}
		}
		
	}
}
