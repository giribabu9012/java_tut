class showroom 
{
	public static void main(String[] args) 
	{
		bike1 b1=new bike1("pulsar","white",180000,new engine("petrol","4","200cc"));
		bike1 b2=new bike1("ktm","black",380000,new engine("petrol","4","200cc"));
		bike1[]bikes={b1,b2};
		for(int i=0;i<bikes.length;i++)
		{
			bikes[i].bikedetails();
			bikes[i].gete().details();
		}
	}
}
