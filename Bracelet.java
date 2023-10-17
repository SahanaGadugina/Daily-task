class Bracelet
{
	String color;
	int noOfBracelet;
	String design;
	String brand;
	double price;
	Bracelet()
	{
		System.out.println("This is a default constructor");
	}
	Bracelet(String color)
	{
		this.color=color;
	}
	Bracelet(String color,int noOfBracelet)
	{
		this(color);
		this.noOfBracelet=noOfBracelet;
	}
	Bracelet(String color,int noOfBracelet,String design)
	{
		this(color,noOfBracelet);
		this.design=design;
	}
	Bracelet(String color,int noOfBracelet,String design,String brand)
	{
		this(color,noOfBracelet,design);
		this.brand=brand;
	}
	Bracelet(String color,int noOfBracelet,String design,String brand,double price)
	{
		this(color,noOfBracelet,design,brand);
		this.price=price;
	}
}

	
	
	