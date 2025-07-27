import java.util.*;
class uniquenumber 
{
	public static int[] uni(int[]a){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==Integer.MIN_VALUE)
				continue;
			for(int j=i+1;j<a.length;j++){
				if(a[j]==Integer.MIN_VALUE)
				continue;
				if(a[i]==a[j]){
					a[j]=Integer.MIN_VALUE;
					count++;
					a[i]=Integer.MIN_VALUE;
					count++;
					}
				}
			}
		int []res=new int[a.length-count];
			for(int i=0;i<a.length;i++){
			if(a[i]!=Integer.MIN_VALUE){		
			}
		}
		return res;
	}
				
	public static void main(String[] args) 
	{
		int[]a={8,3,8,4,3,5,6,6};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		uni(a);
		System.out.println(Arrays.toString(uni(a)));
	}
}
