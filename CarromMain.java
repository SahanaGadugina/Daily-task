class CarromMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in CarromMain");
		
		Carrom carrom=new Carrom();
		System.out.println("carrom noOfStrikers:"+carrom.noOfStrikers);
		System.out.println("carrom noOfCoins:"+carrom.noOfCoins);
		System.out.println("carrom noOfPlayers:"+carrom.noOfPlayers);
		System.out.println("carrom BoardName:"+carrom.BoardName);
		System.out.println("carrom sizeInInches:"+carrom.sizeInInches);
		
		Carrom carrom1=new Carrom(2);
		System.out.println("carrom noOfStrikers:"+carrom1.noOfStrikers);
		System.out.println("carrom noOfCoins:"+carrom1.noOfCoins);
		System.out.println("carrom noOfPlayers:"+carrom1.noOfPlayers);
		System.out.println("carrom BoardName:"+carrom1.BoardName);
		System.out.println("carrom sizeInInches:"+carrom1.sizeInInches);
		
		Carrom carrom2=new Carrom(2,19);
		System.out.println("carrom noOfStrikers:"+carrom2.noOfStrikers);
		System.out.println("carrom noOfCoins:"+carrom2.noOfCoins);
		System.out.println("carrom noOfPlayers:"+carrom2.noOfPlayers);
		System.out.println("carrom BoardName:"+carrom2.BoardName);
		System.out.println("carrom sizeInInches:"+carrom2.sizeInInches);
		
		Carrom carrom3=new Carrom(2,19,"Synco");
		System.out.println("carrom noOfStrikers:"+carrom3.noOfStrikers);
		System.out.println("carrom noOfCoins:"+carrom3.noOfCoins);
		System.out.println("carrom noOfPlayers:"+carrom3.noOfPlayers);
		System.out.println("carrom BoardName:"+carrom3.BoardName);
		System.out.println("carrom sizeInInches:"+carrom3.sizeInInches);
		
		Carrom carrom4=new Carrom(2,19,"Synco",1900);
		System.out.println("carrom noOfStrikers:"+carrom4.noOfStrikers);
		System.out.println("carrom noOfCoins:"+carrom4.noOfCoins);
		System.out.println("carrom noOfPlayers:"+carrom4.noOfPlayers);
		System.out.println("carrom BoardName:"+carrom4.BoardName);
		System.out.println("carrom sizeInInches:"+carrom4.sizeInInches);
		
		Carrom carrom5=new Carrom(2,19,"Synco",1900,2);
		System.out.println("carrom noOfStrikers:"+carrom5.noOfStrikers);
		System.out.println("carrom noOfCoins:"+carrom5.noOfCoins);
		System.out.println("carrom noOfPlayers:"+carrom5.noOfPlayers);
		System.out.println("carrom BoardName:"+carrom5.BoardName);
		System.out.println("carrom sizeInInches:"+carrom5.sizeInInches);
		System.out.println("Ending main in CarromMain");
		
	}
}