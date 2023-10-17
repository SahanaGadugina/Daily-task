class OrnamentMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in OrnamentMain");
		
		Ornament ornament=new Ornament();
		System.out.println("Ornament type:"+ornament.type);
		System.out.println("Ornament cost:"+ornament.cost);
		System.out.println("Ornament design:"+ornament.design);
		System.out.println("Ornament noOfItems:"+ornament.noOfItems);
		
		Ornament ornament1=new Ornament("Gold");
		System.out.println("Ornament type:"+ornament1.type);
		System.out.println("Ornament cost:"+ornament1.cost);
		System.out.println("Ornament design:"+ornament1.design);
		System.out.println("Ornament noOfItems:"+ornament1.noOfItems);
		
		Ornament ornament2=new Ornament("Gold",150000);
		System.out.println("Ornament type:"+ornament2.type);
		System.out.println("Ornament cost:"+ornament2.cost);
		System.out.println("Ornament design:"+ornament2.design);
		System.out.println("Ornament noOfItems:"+ornament2.noOfItems);
		
		Ornament ornament3=new Ornament("gold",150000,"Necklace");
		System.out.println("Ornament type:"+ornament3.type);
		System.out.println("Ornament cost:"+ornament3.cost);
		System.out.println("Ornament design:"+ornament3.design);
		System.out.println("Ornament noOfItems:"+ornament3.noOfItems);
		
		Ornament ornament4=new Ornament("gold",150000,"Necklace",2);
		System.out.println("Ornament type:"+ornament4.type);
		System.out.println("Ornament cost:"+ornament4.cost);
		System.out.println("Ornament design:"+ornament4.design);
		System.out.println("Ornament noOfItems:"+ornament4.noOfItems);
		
		System.out.println("Ending main in OrnamentMain");
	}
}

		
		
		
		
		
		
		
		
		