class PlacementMain
{
	public static void main(String[] args)
	{
		System.out.println("Strting main in PlacementMain");
		Placement placement1=new Placement(20);
		placement1.display();
		Placement placement2=new Placement("BTM-layout");
		placement2.display();
		Placement placement3=new Placement("BTM",23);
		placement3.display();
		Placement placement4=new Placement("BTM",23,"female");
		placement4.display();
		Placement placement5=new Placement("BTM",23,"female",50);
		placement5.display();
		Placement placement6=new Placement("BTM",23,"female",50,"Accenture");
		placement6.display();
		Placement placement7=new Placement("BTM",23,"female",50,"Accenture",5.5);
		placement7.display();
		Placement placement8=new Placement("BTM",23,"female",50,"Accenture",5.5,"Offline");
		placement8.display();
		Placement placement9=new Placement("BTM",23,"female",50,"Accenture",5.5,"Offline",3);
		placement9.display();
		Placement placement10=new Placement("BTM",23,"female",50,"Accenture",5.5,"Offline",3,"11AM");
		placement10.display();
		Placement placement11=new Placement("BTM",23,"female",50,"Accenture",5.5,"Offline",3,"11AM",560076,true);
		placement11.display();
		
		System.out.println("Ending main in PlacementMain");
	}
}
