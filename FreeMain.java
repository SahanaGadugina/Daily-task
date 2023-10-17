class FreeMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in FreeMain");
		Free free=new Free();
		free.display();
		Free free1=new Free("cource");
		free1.display();
		Free free2=new Free("cource","help");
		free2.display();
		Free free3=new Free("cource","help","No");
		free3.display();
		
		System.out.println("Ending main in FreeMain");
	}
}
