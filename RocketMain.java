class RocketMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in RocketMain");
		Rocket rocket=new Rocket();
		System.out.println("Rocket color:"+rocket.color);
		System.out.println("Rocket weight:"+rocket.weight);
		System.out.println("Rocket height:"+rocket.height);
		System.out.println("Rocket name:"+rocket.name);
		
		Rocket rocket1=new Rocket("white");
		System.out.println("rocket1 color:"+rocket1.color);
		System.out.println("rocket1 weight:"+rocket1.weight);
		System.out.println("rocket1 height:"+rocket1.height);
		System.out.println("rocket1 name:"+rocket1.name);
		
		Rocket rocket2=new Rocket("white",10.7);
		System.out.println("rocket2 color:"+rocket2.color);
		System.out.println("rocket2 weight:"+rocket2.weight);
		System.out.println("rocket2 height:"+rocket2.height);
		System.out.println("rocket2 name:"+rocket2.name);
		
		Rocket rocket3=new Rocket("white",10.7,17);
		System.out.println("rocket3 color:"+rocket3.color);
		System.out.println("rocket3 weight:"+rocket3.weight);
		System.out.println("rocket3 height:"+rocket3.height);
		System.out.println("rocket3 name:"+rocket3.name);
		
		Rocket rocket4=new Rocket(10.7,17,"white","Thor");
		System.out.println("rocket4 color:"+rocket4.color);
		System.out.println("rocket4 weight:"+rocket4.weight);
		System.out.println("rocket4 height:"+rocket4.height);
		System.out.println("rocket4 name:"+rocket4.name);
		
		System.out.println("Ending main in RocketMain");
	}
}

		
		
		