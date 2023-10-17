class Ornament
{
	String type;
	double cost;
	String design;
	int noOfItems;
	Ornament()
	{
		System.out.println("This is a default constructor");
	}
	Ornament(String type)
	{
		this.type=type;
	}
	Ornament(String type,double cost)
	{
		this.type=type;
		this.cost=cost;
	}
	Ornament(String type,double cost,String design)
	{
		this.type=type;
		this.cost=cost;
		this.design=design;
	}
	Ornament(String type,double cost,String design,int noOfItems)
	{
		this.type=type;
		this.cost=cost;
		this.design=design;
		this.noOfItems=noOfItems;
	}
}