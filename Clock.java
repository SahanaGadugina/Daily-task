class Clock
{
	String format;
	int width;
	int height;
	boolean showsecond;
	Clock()
	{
		System.out.println("This is default constructor");
	}
	Clock(String format)
	{
		this.format=format;
	}
	Clock(String format,int width)
	{
		super();
		this.format=format;
		this.width=width;
	}
	Clock(int width,String format,int height)
	{
		super();
		this.width=width;
		this.format=format;
		this.height=height;
	}
	Clock(int width,String format,int height,boolean showsecond)
	{
		super();
		this.width=width;
		this.format=format;
		this.height=height;
		this.showsecond=showsecond;
	}
}

		