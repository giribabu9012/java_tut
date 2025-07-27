import java.util.*;
class calculator 
{
	static Scanner sc=new Scanner(System.in);
	public static void cal(int a,int b) 
	{
	System.out.println("1.ADD");
	System.out.println("2.SUB");
	System.out.println("3.MUL");
	System.out.println("4.DIV");
	System.out.println("5.MOD");
	System.out.println("CHOOSE ANY ONE OPTION:");
	int c=sc.nextInt();
	switch(c){
		case 1:
			System.out.println("ANSWER IS:"+(a+b));
		break;
		case 2:
			System.out.println("ANSWER IS:"+(a-b));
		break;
		case 3:
			System.out.println("ANSWER IS:"+(a*b));
		break;
		case 4:
			System.out.println("ANSWER IS:"+(a/b));
		break;
		case 5:
			System.out.println("ANSWER IS:"+(a%b));
		break;
		default:
			System.out.println("INVALID OPTION");
	}
}	
	public static void main(String []args)
	{
		System.out.println("ENTER A FIRST NUMBER:");
		int a=sc.nextInt();
		System.out.println("ENTER A SECOND NUMBER:");
		int b=sc.nextInt();
		cal(a,b);
	}
}
