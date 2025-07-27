class engine 
{
	String type;
	String stroke;
	String power;
	 public engine(String type,String stroke,String power)
	{
		 this.type=type;
		 this.stroke=stroke;
		 this.power=power;
	}
	public void details()
	{
		System.out.println("Engine type:"+type);
		System.out.println("Engine stroke:"+stroke);
		System.out.println("Engine power:"+power);
	}
}
