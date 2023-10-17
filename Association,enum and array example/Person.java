class Person
{
	String name;
	Email email;
	Person(String name,Email email)
	{
		this.name=name;
		this.email=email;
	}
	void showInfo()
	{
		email.showInfo();
		System.out.println("Person name:"+name);
		System.out.println("Person email:"+email);

	}
}