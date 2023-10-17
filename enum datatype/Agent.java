class Agent
{
	int id=2;
	String name="mathin";
	String company="Bajaj";
	Tent tent;
	//All members of tent
	void openTent(Tent tent)
	{
		System.out.println("Opening tent:"+tent.open());
		System.out.println("Tent slNo:"+tent.slNo);
		System.out.println("Tent width:"+tent.width);
		System.out.println("Tent height:"+tent.height);
	}
	//All members of tent
	void closeTent(Tent tent)
	{
		System.out.println("closing tent:"+tent.close());
		System.out.println("Tent slNo:"+tent.slNo);
		System.out.println("Tent width:"+tent.width);
		System.out.println("Tent height:"+tent.height);
	}
	void showInfo()
	{
		System.out.println("Agent id:"+id);
		System.out.println("Agent name:"+name);
		System.out.println("Agent company:"+company);
		
	}
}