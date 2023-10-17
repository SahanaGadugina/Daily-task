class Placement
{
	int noOfPlacements;
	String location;
	int age;
	String gender;
	int noOfStu;
	String company;
	double package1;
	String modeOfTest;
	int noOfRounds;
	String time;
	long pincode;
	boolean placed;
	Placement(int noOfPlacements)
	{
		this.noOfPlacements=noOfPlacements;
	}
	Placement(String location)
	{
		this.location=location;
	}
	Placement(String location,int age)
	{
		this(location);
		this.age=age;
	}
	Placement(String location,int age,String gender )
	{
		this(location,age);
		this.gender=gender;
	}
	Placement(String location,int age,String gender,int noOfStu)
	{
		this(location,age,gender);
		this.noOfStu=noOfStu;
	}
	Placement(String location,int age,String gender,int noOfStu,String company)
	{
		this(location,age,gender,noOfStu);
		this.company=company;
	}
	Placement(String location,int age,String gender,int noOfStu,String company,double package1)
	{
		this(location,age,gender,noOfStu);
		this.package1=package1;
	}
	
	Placement(String location,int age,String gender,int noOfStu,String company,double package1,String modeOfTest)
	{
		this(location,age,gender,noOfStu,company,package1);
		this.modeOfTest=modeOfTest;
	}
	Placement(String location,int age,String gender,int noOfStu,String company,double package1,String modeOfTest,int noOfRounds)
	{
		this(location,age,gender,noOfStu,company,package1,modeOfTest);
		this.noOfRounds=noOfRounds;
	}
	Placement(String location,int age,String gender,int noOfStu,String company,double package1,String modeOfTest,int noOfRounds,String time)
	{
		this(location,age,gender,noOfStu,company,package1,modeOfTest,noOfRounds);
		this.time=time;
	}
	Placement(String location,int age,String gender,int noOfStu,String company,double package1,String modeOfTest,int noOfRounds,String time,long pincode,boolean placed)
	{
		this(location,age,gender,noOfStu,company,package1,modeOfTest,noOfRounds,time);
		this.pincode=pincode;
		this.placed=placed;
	}
	void display()
	{
		System.out.println("Placement noOfPlacements:"+this.noOfPlacements);
		System.out.println("Placement location:"+this.location);
		System.out.println("Placement age:"+this.age);
		System.out.println("Placement gender:"+this.gender);
		System.out.println("Placement noOfStu:"+this.noOfStu);
		System.out.println("Placement company:"+this.company);
		System.out.println("Placement package1:"+this.package1);
		System.out.println("Placement modeOfTest:"+this.modeOfTest);
		System.out.println("Placement noOfRounds:"+this.noOfRounds);
		System.out.println("Placement time:"+this.time);
		System.out.println("Placement pincode:"+this.pincode);
		System.out.println("Placement placed:"+this.placed);
	}
}


	
	
	