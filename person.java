class person 
{
	String name;
	int age;
	String gender;
	String insta_id;
	public person(String name,int age,String gender,String insta_id)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.insta_id=insta_id;
	}
	
	public void details() 
	{
		System.out.println("Person name:"+name);
		System.out.println("Person age:"+age);
		System.out.println("Person gender:"+gender);
		System.out.println("Person insta_id:"+insta_id);
	}
}
