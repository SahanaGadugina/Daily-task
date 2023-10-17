class Player
{
	String name;
	Game game;
	void Player(String name,Game game)
	{
		this.name=name;
		this.game=game;
	}
	void pauseGame()
	{
		System.out.println("Starting pauseGame in player");
		System.out.println("Ending pauseGame in player");
	}
	void endGame()
	{
		System.out.println("Starting endGame in player");
		System.out.println("Ending endGame in player");
	}
	void showInfo()
	{
		System.out.println("Player name:"+name);
		System.out.println("Player game:"+game);
		if(game!=null)
		{
			System.out.println("Game id:"+game.id);
			System.out.println("Game name:"+game.name);
			System.out.println("Game totalplayers:"+game.totalplayers);
			System.out.println("Game origin:"+game.origin);
		}
	}
}