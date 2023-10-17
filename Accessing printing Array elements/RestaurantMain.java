class RestaurantMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in RestaurantMain");
		Restaurant resto=new Restaurant();
		String[] specialItems=new String[5];
		specialItems[0]="roti";
		specialItems[1]="paneer";
		specialItems[2]="paneer-tikka";
		specialItems[3]="khichdi";
		specialItems[4]="falooda";
		System.out.println(specialItems);
		resto.setSpecialItems(specialItems);
		resto.showInfo();
		System.out.println("Ending main in RestaurantMain");
	}
}