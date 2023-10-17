class ClockMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in ClockMain");
		Clock clock=new Clock();
		System.out.println("Clock format:"+clock.format);
		System.out.println("Clock height:"+clock.height);
		System.out.println("Clock width:"+clock.width);
		System.out.println("Clock showsecond:"+clock.showsecond);
		
		Clock clock1=new Clock("24 hours");
		System.out.println("Clock format:"+clock1.format);
		System.out.println("Clock height:"+clock1.height);
		System.out.println("Clock width:"+clock1.width);
		System.out.println("Clock showsecond:"+clock1.showsecond);
		
		Clock clock2=new Clock("24-hours",170);
		System.out.println("Clock format:"+clock2.format);
		System.out.println("Clock height:"+clock2.height);
		System.out.println("Clock width:"+clock2.width);
		System.out.println("Clock showsecond:"+clock2.showsecond);
		
		Clock clock3=new Clock(170,"24-hors",180);
		System.out.println("Clock format:"+clock3.format);
		System.out.println("Clock height:"+clock3.height);
		System.out.println("Clock width:"+clock3.width);
		System.out.println("Clock showsecond:"+clock3.showsecond);
		
		Clock clock4=new Clock(170,"24-hors",180,true);
		System.out.println("Clock format:"+clock4.format);
		System.out.println("Clock height:"+clock4.height);
		System.out.println("Clock width:"+clock4.width);
		System.out.println("Clock showsecond:"+clock4.showsecond);
		
		System.out.println("Ending main in Showsecond");
	}
}
