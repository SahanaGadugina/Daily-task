class Carrom
{
	int noOfStrikers;
	int noOfCoins;
	String BoardName;
	int sizeInInches;
	int noOfPlayers;
	Carrom()
	{
		System.out.println("This is a default constructor");
	}
	Carrom(int noOfStrikers)
	{
		this.noOfStrikers=noOfStrikers;
	}
	Carrom(int noOfStrikers,int noOfCoins)
	{
		this(noOfStrikers);
		this.noOfCoins=noOfCoins;
	}
	Carrom(int noOfStrikers,int noOfCoins,String BoardName)
	{
		this(noOfStrikers,noOfCoins);
		this.BoardName=BoardName;
	}
	Carrom(int noOfStrikers,int noOfCoins,String BoardName,int sizeInInches)
	{
		this(noOfStrikers,noOfCoins,BoardName);
		this.sizeInInches=sizeInInches;
	}
	Carrom(int noOfStrikers,int noOfCoins,String BoardName,int sizeInInches,int noOfPlayers)
	{
		this(noOfStrikers,noOfCoins,BoardName,sizeInInches);
		this.noOfPlayers=noOfPlayers;
	}
}
	
	
	
	
	