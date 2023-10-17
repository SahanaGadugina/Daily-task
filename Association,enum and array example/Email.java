class Email
{
	Domain1 domain;
	int id;
	String fName;
	String lastName;
	String[] values;
	Email()
	{
		System.out.println("This is default constructor");
	}
	Email(Domain1 domain,int id,String fName,String lastName,String[] values)
	{
		this.domain=domain;
		this.id=id;
		this.fName=fName;
		this.lastName=lastName;
		this.values=values;
	}
		
	void showInfo()
	{

		System.out.println("email id:"+id);
		System.out.println("Email fName:"+fName);
		System.out.println("Email lastName:"+lastName);
		System.out.println("Email Domain:"+domain);
		if(this.domain!=null)
		{
			System.out.println("Email:"+Domain1.EMAIL);
			System.out.println("YAHOO:"+Domain1.YAHOO);
			System.out.println("GMAIL:"+Domain1.GMAIL);
			for(int index=0;index<values.length;index++)
			{
				String ref[]=this.values[index];
				System.out.println("Emails:" +ref[] " at index"+index);
			}
		}

		
	}
}