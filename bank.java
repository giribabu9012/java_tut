class bank 
{
	String bname;
	String ifsc;
	String branch;
	int acno;
	
	public bank(String bname,String ifsc,String branch,int acno)
	{
		this.bname=bname;
		this.ifsc=ifsc;
		this.branch=branch;
		this.acno=acno;
	}
	public void details() 
	{
		System.out.println("Bank name:"+bname);
		System.out.println("Ifsc code:"+ifsc);
		System.out.println("Branch:"+branch);
		System.out.println("Account number:"+acno);
	}
}