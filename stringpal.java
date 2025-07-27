import java.util.*;
class stringpal  
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the string name:");
		String s=sc.nextLine();
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		if(s.equals(res))
			
			System.out.println("It is a palindrome");
			
		else
			
			System.out.println("It is  a not palindrome");
		
	}
}
