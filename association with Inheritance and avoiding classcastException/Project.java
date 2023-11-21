class Project
{
	Project()
	{
		System.out.println("No-arg constructor in Project");
	}
	void validate(Person person,Developer developer)
	{
		System.out.println("Starting validate in Project");
		System.out.println("Person:"+person);
		System.out.println("Developer:"+developer);
		if(person!=null)
		{
			person.eat();
			person.sleep();
		}
		if(person instanceof Developer)
		{
			Developer dev=(Developer)person;
		}
		if(person instanceof BusinessAnalyst)
		{
			BusinessAnalyst ba=(BusinessAnalyst)person;
		}
		if(person instanceof ProductOwner)
		{
			ProductOwner po=(ProductOwner)person;
		}
		if(person instanceof Devops)
		{
			Devops devops=(Devops)person;
		}
		if(developer!=null)
		{
			developer.code();
		}
		if(developer instanceof Tester)
		{
			Tester tester=(Tester)developer;
		}
		if(developer instanceof DataBaseDeveloper)
		{
			DataBaseDeveloper dd=(DataBaseDeveloper)developer;
		}
		
	}
}
