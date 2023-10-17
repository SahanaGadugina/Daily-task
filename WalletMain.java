class WalletMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in walletMain");
		
		Wallet wallet=new Wallet();
		System.out.println("Wallet color:"+wallet.color);
		System.out.println("Wallet brand:"+wallet.brand);
		System.out.println("Wallet size:"+wallet.size);
		System.out.println("Wallet price:"+wallet.price);
		
		Wallet wallet1=new Wallet(450);
		System.out.println("wallet1 color:"+wallet1.color);
		System.out.println("wallet1 brand:"+wallet1.brand);
		System.out.println("wallet1 size:"+wallet1.size);
		System.out.println("wallet1 price:"+wallet1.price);
		
		Wallet wallet2=new Wallet(450,"Baggit");
		System.out.println("Wallet color:"+wallet2.color);
		System.out.println("Wallet brand:"+wallet2.brand);
		System.out.println("Wallet size:"+wallet2.size);
		System.out.println("Wallet price:"+wallet2.price);
		
		Wallet wallet3=new Wallet(450,"Baggit","red");
		System.out.println("Wallet color:"+wallet3.color);
		System.out.println("Wallet brand:"+wallet3.brand);
		System.out.println("Wallet size:"+wallet3.size);
		System.out.println("Wallet price:"+wallet3.price);
		
		Wallet wallet4=new Wallet(450,"Baggit","red",5.5);
		System.out.println("Wallet color:"+wallet4.color);
		System.out.println("Wallet brand:"+wallet4.brand);
		System.out.println("Wallet size:"+wallet4.size);
		System.out.println("Wallet price:"+wallet4.price);
		
		System.out.println("Ending main in walletMain");
	}
}

		
	