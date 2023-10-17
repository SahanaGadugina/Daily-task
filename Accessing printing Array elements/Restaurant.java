class Restaurant
{
	//literals,ref,methods,constructor
	String ownerName="Shalini";//literals
	String[] specialItems;//methods
	void setSpecialItems(String[] specialItems)
	{
		this.specialItems=specialItems;
	}
	void showInfo()
	{
		System.out.println("Starting showInfo in Restaurant");
		System.out.println("Restaurant ownerName:"+ownerName);
		System.out.println("Restaurant specialItem:"+specialItems);
		if(this.specialItems!=null)
		{
			for(int seq=0;seq<specialItems.length;seq++)
			{
				String ref=this.specialItems[seq];
				System.out.println("specialItems:"+ref +" at "+seq);
			}
		}
		System.out.println("Ending showInfo in Restaurant");
	}
}
	