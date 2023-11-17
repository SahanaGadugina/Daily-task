class Food2OxygenMain
{
	public static void main(String... values)
	{
		System.out.println("Starting main in Food2OxygenMain");
		Food2 food=new Plant();
		food.eating();
		Plant plant=(Plant)food;
		plant.oxygen();
		System.out.println("Ending main in Food2OxygenMain");
	}
}
