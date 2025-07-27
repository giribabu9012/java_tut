import java.util.*;
class pattern1
{
	public static void main(String[] args) 
	{ 
		int n=5;
		for(int a=0;a<n;a++){
			for(int b=0;b<n;b++)
			{ 
				if(a+b<=n-1)//(a>=b)      //(a<=b)    //  (a+b>=n-1)
				System.out.print("* ");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
