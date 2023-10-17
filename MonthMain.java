class MonthMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in MonthMain");
		Month month=new Month();
		month.display();
		Month month1=new Month("Thursday");
		month1.display();
		Month month2=new Month("Thursday",29);
		month2.display();
		Month month3=new Month("Monday",28,3);
		month3.display();
		Month month4=new Month("Thursday",28,4,8);
		month4.display();
		
		System.out.println("Ending main in MonthMain");
	}
}
