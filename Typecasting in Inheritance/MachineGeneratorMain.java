class MachineGeneratorMain
{
	public static void main(String... values)
	{
		System.out.println("Starting main in MachineGeneratorMain");
		Machine machine=new Generator();
		machine.process();
		Generator generator=(Generator)machine;
		generator.powerSupply();
		System.out.println("Ending main in MachineGeneratorMain");
	}
}
