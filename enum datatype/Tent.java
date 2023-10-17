class Tent
{
	int slNo=5;
	Color color;
	double width=10;
	double height=20;
	boolean open()
	{
		System.out.println("starting open in tent");
		return true;
		
	}
	boolean close()
	{
		System.out.println("Starting close in tent");
		return true;
		
	}
	void showInfo()
	{
		System.out.println("Tent slNo:"+slNo);
		if(color!=null)
		{
		System.out.println("Tent color:"+Color.SKYBLUE);
		System.out.println("Tent color:"+Color.ORANGE);
		System.out.println("Tent color:"+Color.WHITE);
		}
		System.out.println("Tent width:"+width);
		System.out.println("Tent height:"+height);
		
	}
}