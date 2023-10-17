class GameMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in GameMain");
		Game game=new Game(30,"Cricket",totalplayers,"Outdoor");
		game.showInfo();
		
		Player player=new Player("kohli",game);
		player.showInfo();
		player.Player("kohli",game);
		player.pauseGame();
		player.endGame();
		System.out.println("ending main in GameMain");
	}
}