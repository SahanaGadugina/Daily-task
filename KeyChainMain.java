class KeyChainMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in KeyChainMain ");
		KeyChain keychain=new KeyChain();
		System.out.println("Keychain color:"+keychain.color);
		System.out.println("Keychain noOfChains:"+keychain.noOfChains);
		System.out.println("Keychain length:"+keychain.length);
		System.out.println("Keychain price:"+keychain.price);
		System.out.println("Keychain name:"+keychain.name);
		
		KeyChain keychain1=new KeyChain("pink");
		System.out.println("Keychain color:"+keychain1.color);
		System.out.println("Keychain noOfChains:"+keychain1.noOfChains);
		System.out.println("Keychain length:"+keychain1.length);
		System.out.println("Keychain price:"+keychain1.price);
		System.out.println("Keychain name:"+keychain1.name);
		
		KeyChain keychain2=new KeyChain("pink",5);
		System.out.println("Keychain color:"+keychain2.color);
		System.out.println("Keychain noOfChains:"+keychain2.noOfChains);
		System.out.println("Keychain length:"+keychain2.length);
		System.out.println("Keychain price:"+keychain2.price);
		System.out.println("Keychain name:"+keychain2.name);
		
		KeyChain keychain3=new KeyChain("pink",5,10);
		System.out.println("Keychain color:"+keychain3.color);
		System.out.println("Keychain noOfChains:"+keychain3.noOfChains);
		System.out.println("Keychain length:"+keychain3.length);
		System.out.println("Keychain price:"+keychain3.price);
		System.out.println("Keychain name:"+keychain3.name);
		
		KeyChain keychain4=new KeyChain("pink",5,10,100);
		System.out.println("Keychain color:"+keychain4.color);
		System.out.println("Keychain noOfChains:"+keychain4.noOfChains);
		System.out.println("Keychain length:"+keychain4.length);
		System.out.println("Keychain price:"+keychain4.price);
		System.out.println("Keychain name:"+keychain4.name);
		
		KeyChain keychain5=new KeyChain(("pink",5,10,100,"BestFriends");
		System.out.println("Keychain color:"+keychain5.color);
		System.out.println("Keychain noOfChains:"+keychain5.noOfChains);
		System.out.println("Keychain length:"+keychain5.length);
		System.out.println("Keychain price:"+keychain5.price);
		System.out.println("Keychain name:"+keychain5.name);
		
		System.out.println("Ending main in KeyChainMain ");
	}
}
