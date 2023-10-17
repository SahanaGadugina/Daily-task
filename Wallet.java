class Wallet
{
	double price;
	String brand;
	String color;
	double size;
	Wallet()
	{
		System.out.println("This is a default constructor");
	}
	Wallet(double price)
	{
		super();
		this.price=price;
	}
	Wallet(double price,String brand)
	{
		super();
		this.price=price;
		this.brand=brand;
	}
	Wallet(double price,String brand,String color)
	{
		super();
		this.price=price;
		this.brand=brand;
		this.color=color;
	}
	Wallet(double price,String brand,String color,double size)
	{
		super();
		this.price=price;
		this.brand=brand;
		this.color=color;
		this.size=size;
	}
}
