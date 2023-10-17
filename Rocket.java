class Rocket
{
	String color;
	double weight;
	int height;
	String name;
	Rocket()
	{
		System.out.println("This is a default constructor");
	}
	Rocket(String color)
	{
		super();
		this.color=color;
	}
	Rocket(String color,double weight)
	{
		super();
		this.color=color;
		this.weight=weight;
	}
	Rocket(String color,double weight,int height)
	{
		super();
		this.color=color;
		this.weight=weight;
		this.height=height;
	}
	Rocket(double weight,int height,String color,String name)
	{
		super();
		this.weight=weight;
		this.height=height;
		this.name=name;
		this.color=color;
	}
}

	