class employee 
{
	String ename;
	int eid;
	double esal;
	static String company="GB TECH";
	public employee(String ename,int eid,double esal)
	{
		this.ename=ename;
		this.eid=eid;
		this.esal=esal;
	}
	public void details() 
	{
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Salary:"+esal);
		System.out.println("Company Name:"+company);
	}
}
