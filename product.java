class product 
{
	private String name;
	private double price;
	private product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public static product getproduct(String name,double price)
	{
		return new product(name,price);
	}
	public String getname()
	{
		return name;
	}
	public double getprice()
	{
		return price;
	}
}
