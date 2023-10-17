class MakeupKit
{
	int noOfItems;
	double cost;
	String brand;
	String quality;
	MakeupKit()
	{
		System.out.println("This is a default constructor");
	}
	MakeupKit(int noOfItems)
	{
		super();
		this.noOfItems=noOfItems;
	}
	MakeupKit(int noOfItems,double cost)
	{
		super();
		this.noOfItems=noOfItems;
		this.cost=cost;
	}
	MakeupKit(int noOfItems,double cost,String brand)
	{
		super();
		this.noOfItems=noOfItems;
		this.cost=cost;
		this.brand=brand;
	}
	MakeupKit(int noOfItems,double cost,String brand,String quality)
	{
		super();
		this.noOfItems=noOfItems;
		this.cost=cost;
		this.brand=brand;
		this.quality=quality;
	}
}

	
	
	
	