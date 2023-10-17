class PersonEmailMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in PersonEmailMain");
		Domain1 domain=Domain1.GMAIL;
		
		
		
		String[] values=new String[3];
		values[0]="sahana@gmail.com";
		values[1]="shilpa@gmail.com";
		values[2]="soumya@gmail.com";
		Email email1=new Email(domain,1,"shilpa","Gadugina",values[]);
		
		
		Person person=new Person("sahana",email1);
		person.showInfo();
		System.out.println("Ending main in PersonEmailMain");

	}
}