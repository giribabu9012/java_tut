class mda1
{
	public static void main(String[] args) 
	{
		int [][]a=new int[6][6];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				//if(i>=j) (i+j<=n-1) pattern
		System.out.print(a[i][j]+" ");
			}
			System.out.println( );
		}
	}
}
