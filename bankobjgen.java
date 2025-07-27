class bankobjgen 
{
	public static void main(String[] args) 
	{
		bank b1=new bank("Karur vysya bank","kvbl10020","old washermenpet",123445677);
		bank b2=new bank("Indian bank","Ibbl10020","royapuram",120000677);
		bank b3=new bank("Union bank of india","ubi104020","thiruvittuyur",13848577);
		bank b4=new bank("State bank of india","sbi10020","vadapalani",1247483877);
		bank b5=new bank("Indian overseas bank","iobl10020","triplicane",120000007);
		
		bank[]b={b1,b2,b3,b4,b5};
		for(int i=0;i<b.length;i++ )
		{
			b[i].details();
		}
	}
}
