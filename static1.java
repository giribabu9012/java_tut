class static1 
{
	static{
		 int a=30;
		System.out.println("javaScript:"+a);
		System.out.println("javaScript:"+static1.a );
	}
	static boolean a=true;
	static String b="java";
	static{
		System.out.println(a);
		System.out.println(static1.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi from main");
		System.out.println("bye from main");
	}
	public static void solve()
	{
		System.out.println("solving..");
	}
	{
		System.out.println("python");
	}
}
