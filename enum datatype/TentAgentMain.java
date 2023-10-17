class TentAgentMain
{
	public static void main(String[] tent)
	{
		System.out.println("Starting main in TentAgentMain");
		Tent tent1=new Tent();
		
		tent1.showInfo();
		Agent agent=new Agent();
		agent.openTent(tent1);
		
		agent.closeTent(tent1);
		agent.showInfo();
		System.out.println("Ending main in TentAgentMain");
	}
}
