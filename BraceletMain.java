class BraceletMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in BraceletMain");
		Bracelet bracelet=new Bracelet();
		System.out.println("Bracelet color:"+bracelet.color);
		System.out.println("Bracelet design:"+bracelet.design);
		System.out.println("Bracelet noOfBracelet:"+bracelet.noOfBracelet);
		System.out.println("Bracelet brand:"+bracelet.brand);
		System.out.println("Bracelet price:"+bracelet.price);
		
		Bracelet bracelet1=new Bracelet("white");
		System.out.println("Bracelet color:"+bracelet1.color);
		System.out.println("Bracelet design:"+bracelet1.design);
		System.out.println("Bracelet noOfBracelet:"+bracelet1.noOfBracelet);
		System.out.println("Bracelet brand:"+bracelet1.brand);
		System.out.println("Bracelet price:"+bracelet1.price);
		
		Bracelet bracelet2=new Bracelet("white",5);
		System.out.println("Bracelet color:"+bracelet2.color);
		System.out.println("Bracelet design:"+bracelet2.design);
		System.out.println("Bracelet noOfBracelet:"+bracelet2.noOfBracelet);
		System.out.println("Bracelet brand:"+bracelet2.brand);
		System.out.println("Bracelet price:"+bracelet2.price);
		
		Bracelet bracelet3=new Bracelet("white",5,"round");
		System.out.println("Bracelet color:"+bracelet3.color);
		System.out.println("Bracelet design:"+bracelet3.design);
		System.out.println("Bracelet noOfBracelet:"+bracelet3.noOfBracelet);
		System.out.println("Bracelet brand:"+bracelet3.brand);
		System.out.println("Bracelet price:"+bracelet3.price);
		
		Bracelet bracelet4=new Bracelet("white",5,"round","baggit");
		System.out.println("Bracelet color:"+bracelet4.color);
		System.out.println("Bracelet design:"+bracelet4.design);
		System.out.println("Bracelet noOfBracelet:"+bracelet4.noOfBracelet);
		System.out.println("Bracelet brand:"+bracelet4.brand);
		System.out.println("Bracelet price:"+bracelet4.price);
		
		Bracelet bracelet5=new Bracelet("white",5,"round","baggit",500);
		System.out.println("Bracelet color:"+bracelet5.color);
		System.out.println("Bracelet design:"+bracelet5.design);
		System.out.println("Bracelet noOfBracelet:"+bracelet5.noOfBracelet);
		System.out.println("Bracelet brand:"+bracelet5.brand);
		System.out.println("Bracelet price:"+bracelet5.price);
		
		System.out.println("Ending main in BraceletMain");
	}
}
