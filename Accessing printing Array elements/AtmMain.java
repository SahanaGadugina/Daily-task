class AtmMain
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in AtmMain");
		Atm atm=new Atm();
		String[] branch=new String[5];
		branch[0]="Nagatibasapura";
		branch[1]="Rbo Four";
		branch[2]="Cac ";
		branch[3]="Rbo five";
		branch[4]="Sme ";
		
		String[] acs=new String[3];
		acs[0]="blu star";
		acs[1]="voltas";
		acs[2]="Hitachi";
		
		String[] cctvBrand=new String[5];
		cctvBrand[0]="Godrej";
		cctvBrand[1]="CP plus";
		cctvBrand[2]="samsung";
		cctvBrand[3]="Hikivision";
		cctvBrand[4]="Bosch";
		
		atm.setValues(branch,acs,cctvBrand);
		atm.showInfo();
		
		System.out.println("Ending main in AtmMain");
	}
}