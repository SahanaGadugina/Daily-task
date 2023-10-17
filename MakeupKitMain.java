class MakeupKitMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in MakeupKitMain");
		MakeupKit makeupkit=new MakeupKit();
		System.out.println("MakeupKit noOfItems:"+makeupkit.noOfItems);
		System.out.println("MakeupKit brand:"+makeupkit.brand);
		System.out.println("MakeupKit cost:"+makeupkit.cost);
		System.out.println("MakeupKit quality:"+makeupkit.quality);
		
		MakeupKit makeupkit1=new MakeupKit(5);
		System.out.println("MakeupKit noOfItems:"+makeupkit1.noOfItems);
		System.out.println("MakeupKit brand:"+makeupkit1.brand);
		System.out.println("MakeupKit cost:"+makeupkit1.cost);
		System.out.println("MakeupKit quality:"+makeupkit1.quality);
		
		MakeupKit makeupkit2=new MakeupKit(5,1000.5);
		System.out.println("MakeupKit noOfItems:"+makeupkit2.noOfItems);
		System.out.println("MakeupKit brand:"+makeupkit2.brand);
		System.out.println("MakeupKit cost:"+makeupkit2.cost);
		System.out.println("MakeupKit quality:"+makeupkit2.quality);
		
		MakeupKit makeupkit3=new MakeupKit(5,1000.5,"Lakme");
		System.out.println("MakeupKit noOfItems:"+makeupkit3.noOfItems);
		System.out.println("MakeupKit brand:"+makeupkit3.brand);
		System.out.println("MakeupKit cost:"+makeupkit3.cost);
		System.out.println("MakeupKit quality:"+makeupkit3.quality);
		
		MakeupKit makeupkit4=new MakeupKit(5,1000.5,"Lakme","Best");
		System.out.println("MakeupKit noOfItems:"+makeupkit4.noOfItems);
		System.out.println("MakeupKit brand:"+makeupkit4.brand);
		System.out.println("MakeupKit cost:"+makeupkit4.cost);
		System.out.println("MakeupKit quality:"+makeupkit4.quality);
		
		System.out.println("Ending main in MakeupKitMain");
	}
}
