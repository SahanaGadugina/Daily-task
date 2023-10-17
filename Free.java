class Free
{
	String what;
	String why;
	String freeForAll;
	Free()
	{
		System.out.println("---------------------------");
		System.out.println("Default constructor is created");
	}
	Free(String what)
	{
		this.what="cource";
		System.out.println("************************");
	}
	Free(String what,String why)
	{
		this("cource");
		this.why="help";
		System.out.println("============================");
	}
	Free(String what,String why,String freeForAll)
	{
		this("cource","help");
		this.freeForAll="No";
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
	void display()
	{
		System.out.println("Free what:"+this.what);
		System.out.println("Free why:"+this.why);
		System.out.println("Free freeForAll:"+this.freeForAll);
	}
}

		