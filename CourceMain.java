class CourceMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in CourceMain");
		
		Cource cource1=new Cource("Java fullstack");
		cource1.display();
		Cource cource2=new Cource("Java","X-worz");
		cource2.display();
		Cource cource3=new Cource("Java","X-workz",5);
		cource3.display();
		Cource cource4=new Cource("Java","X-workz",5,3);
		cource4.display();
		Cource cource5=new Cource("Java","X-workz",5,3,9);
		cource5.display();
		Cource cource6=new Cource("Java","X-workz",5,3,9,20000);
		cource6.display();
		Cource cource7=new Cource("Java","X-workz",5,3,9,20000,true);
		cource7.display();
		
		System.out.println("Ending main in CourceMain");
		
	}
}
