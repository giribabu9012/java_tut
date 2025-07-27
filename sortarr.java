import java.util.Arrays;
class sortarr 
{ 
	static Scanner sc=new Scanner(System.in);
	{
	public static void main(String [] args) 
	{
		int []a={10,17,29,39,34,50};
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
			int n=sc.nextInt();
		System.out.println("Largest:"+a[a.length-n]);
	}
		
	}
}
