class KeyChain
{
	String color;
	int noOfChains;
	int length;
	double price;
	String name;
	KeyChain()
	{
		System.out.println("This is default constructor");
	}
	KeyChain(String color)
	{
		
		this.color=color;
	}
	KeyChain(String color,int noOfChains)
	{
		this(color);
		this.noOfChains=noOfChains;
	}
	KeyChain(String color,int noOfChains,int length)
	{
		this(color,noOfChains);
		this.length=length;
	}
	KeyChain(String color,int noOfChains,int length,double price)
	{
		this(color,noOfChains,length);
		this.price=price;
	}
	KeyChain(String color,int noOfChains,int length,double price,String name)
	{
		this(color,noOfChains,length,price);
		this.name=name;
	}
}

	
	