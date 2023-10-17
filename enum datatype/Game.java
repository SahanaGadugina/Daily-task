class Game
{
	int id;
	String name;
	TotalPlayers totalplayers;
	String origin;
	void Game(int id,String name,TotalPlayers totalplayers,String origin)
	{
		System.out.println("Starting play in Game");
		System.out.println("Ending play in Game");
	}
	void pause()
	{
		System.out.println("Starting pause in Game");
		System.out.println("ending pause in Game");
	}
	void end()
	{
		System.out.println("Starting end method in Game");
		System.out.println("ending end method in Game");
	}
	void showInfo()
	{
		System.out.println("Game id:"+id);
		System.out.println("Game name:"+name);
		System.out.println("Game totalplayers:"+totalplayers);
		if(totalplayers!=null)
		{
			System.out.println("totalplayers three:"+totalplayers.THREE);
			System.out.println("totalplayers FIVE:"+totalplayers.FIVE);
			System.out.println("totalplayers ELEVEN:"+totalplayers.ELEVEN);
		}
		System.out.println("Game origin:"+origin);
	}
}
	