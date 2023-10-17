class Month
{
	String name;
	int noOfDays;
	int noOfWeekends;
	int noOfHolidays;
	Month()
	{
		this("wednesday",30,4,6);
		System.out.println("This is a default constructor");
		System.out.println(" gshiln;lixnaaksa");
	}
	Month(String name)
	{
		this.name=name;
		System.out.println("jhouhoij");
	}
	Month(String name,int noOfDays)
	{
		this(name);
		this.noOfDays=noOfDays;
		System.out.println("buhojnoijpjk");
	}
	Month(String name,int noOfDays,int noOfWeekends)
	{
		this("wednesday",30);
		this.noOfWeekends=noOfWeekends;
		System.out.println("bojkm[llllllllllllvygbsdiubdsssssssiu");
	}
	Month(String name,int noOfDays,int noOfWeekends,int noOfHolidays)
	{
		this(name,noOfDays,noOfWeekends);
		this.noOfHolidays=6;
		System.out.println("go9ujoljk[2iks-qeowjwidjwfuygwhfbehbfhkebfkehndwnsdwn");
	}
	void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("No ofDays:"+this.noOfDays);
		System.out.println("No of weekends:"+this.noOfWeekends);
		System.out.println("No of Holidays:"+this.noOfHolidays);
	}
}


	