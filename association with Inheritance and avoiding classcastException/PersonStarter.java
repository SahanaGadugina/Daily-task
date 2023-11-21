class PersonStarter
{
	public static void main(String... values)
	{
		System.out.println("Starting main in PersonStarter");
		Person person=new Person();//object creation for parent class
		Developer developer=new Developer();
		
		Tester tester=new Tester();
		BusinessAnalyst ba=new BusinessAnalyst();
		ProductOwner po=new ProductOwner();
		DataBaseDeveloper dd=new DataBaseDeveloper();
		Devops devops=new Devops();
		Project project=new Project();
		
		project.validate(developer,tester);
		project.validate(ba,dd);
		project.validate(po,null);
		project.validate(devops,null);
		
		System.out.println("Ending main in PersonStarter");
	}
}