import java.util.*;
class string3 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the sentence1:");
		String sentence1=sc.nextLine();
		System.out.println("Enter the sentence2:");
		String sentence2=sc.nextLine();
		System.out.println("sentence1:"+sentence1);
		System.out.println("sentence2:"+sentence2);
		System.out.println(sentence1==sentence2);
		System.out.println("sentence1:"+sentence1);
		System.out.println(sentence1.equals(sentence2));
		System.out.println(sentence1.equalsIgnoreCase(sentence2));
		
	}
}
