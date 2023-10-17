class Cource
{
	String nameOfCource;
	String nameOfInstitute;
	int noOfTrainers;
	int noOfBatches;
	int noOfTechnologies;
	double feeStructure;
	boolean placements;
	Cource(String nameOfCource)
	{
		this.nameOfCource=nameOfCource;
	}
	Cource(String nameOfCource,String nameOfInstitute)
	{
		this(nameOfCource);
		this.nameOfInstitute=nameOfInstitute;
	}
	Cource(String nameOfCource,String nameOfInstitute,int noOfTrainers)
	{
		this(nameOfCource,nameOfInstitute);
		this.noOfTrainers=noOfTrainers;
	}
	Cource(String nameOfCource,String nameOfInstitute,int noOfTrainers,int noOfBatches)
	{
		this(nameOfCource,nameOfInstitute,noOfTrainers);
		this.noOfBatches=noOfBatches;
	}
	Cource(String nameOfCource,String nameOfInstitute,int noOfTrainers,int noOfBatches,int noOfTechnologies)
	{
		this(nameOfCource,nameOfInstitute,noOfTrainers,noOfBatches);
		this.noOfTechnologies=noOfTechnologies;
	}
	Cource(String nameOfCource,String nameOfInstitute,int noOfTrainers,int noOfBatches,int noOfTechnologies,double feeStructure)
	{
		this(nameOfCource,nameOfInstitute,noOfTrainers,noOfBatches,noOfTechnologies);
		this.feeStructure=feeStructure;
	}
	Cource(String nameOfCource,String nameOfInstitute,int noOfTrainers,int noOfBatches,int noOfTechnologies,double feeStructure,boolean placements)
	{
		this(nameOfCource,nameOfInstitute,noOfTrainers,noOfBatches,noOfTechnologies,feeStructure);
		this.noOfTechnologies=noOfTechnologies;
	}
	void display()
	{
		System.out.println("nameOfCource:"+this.nameOfCource);
		System.out.println("nameOfInstitute:"+this.nameOfInstitute);
		System.out.println("noOfTrainers:"+this.noOfTrainers);
		System.out.println("noOfBatches:"+this.noOfBatches);
		System.out.println("noOfTechnologies:"+this.noOfTechnologies);
		System.out.println("feeStructure:"+this.feeStructure);
		System.out.println("placements:"+this.placements);
	}
}