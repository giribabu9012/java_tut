import java.util.*;
class bubblesort 
{
	public static void bub(int []a) 
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
		public static void main(String []args){
		int []a={23,24,25,7,9,11};
		System.out.println(Arrays.toString(a));
		bub(a);
		System.out.println(Arrays.toString(a));
	}
}
