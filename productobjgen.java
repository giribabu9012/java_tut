class productobjgen 
{
	public static void main(String[] args) 
	{
		product p1=product.getproduct("Shirt",700);
		product p2=product.getproduct("Pant",950);
		System.out.println("Name:"+p1.getname());
		System.out.println("price:"+p1.getprice());
		System.out.println("Name:"+p2.getname());
		System.out.println("price:"+p2.getprice());
	}
}
