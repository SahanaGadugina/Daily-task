class WoodBatMain
{
	public static void main(String... values)
	{
		System.out.println("Starting main in WoodBatMain");
		Wood wood=new Bat();
		wood.furniture();
		Bat bat=(Bat)wood;
		bat.batting();
		
		System.out.println("ending main in WoodBatMain");
	}
}