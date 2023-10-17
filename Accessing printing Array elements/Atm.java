class Atm
{
	String bankName="SBI";//literals
	String[] branch;//methods
	String[] acs;//methods
	String[] cctvBrand;//methods
	Atm()
	{
		System.out.println("Starting no-arg construct.....");
	}
	void setValues(String[] branch,String[] acs,String[] cctvBrand)
	{
		this.branch=branch;
		this.acs=acs;
		this.cctvBrand=cctvBrand;
	}
	void showInfo()
	{
		System.out.println("Branch name"+branch);
		System.out.println("Acs"+acs);
		System.out.println("cctvBrand"+cctvBrand);
		if(this.branch!=null)
		{
			for(int seq=0;seq<this.branch.length;seq++)
			{
				String ref=this.branch[seq];
				System.out.println("branch names:"+ref +"at "+seq);
			}
		}
		if(this.acs!=null)
		{
			for(int seq=0;seq<this.acs.length;seq++)
			{
				String ref=this.acs[seq];
				System.out.println("acs names:"+ref +"at "+seq);
			}
		}
		if(this.cctvBrand!=null)
		{
			for(int seq=0;seq<this.cctvBrand.length;seq++)
			{
				String ref=this.cctvBrand[seq];
				System.out.println("cctvBrand names:"+ref +"at "+seq);
			}
		}
	}
}