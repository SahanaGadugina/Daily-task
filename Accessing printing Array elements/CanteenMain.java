class CanteenMain
{
	public static void main(String[] args)
	{
		System.out.println("Strting main in CanteenMain");
		Canteen canteen=new Canteen();
		String[] utensils=new String[40];
		utensils[0]="Ladle";
		utensils[1]="Colander";
		utensils[2]="Spoon";
		utensils[3]="Tongs";
		utensils[4]="Whisk";
		utensils[5]="Knife";
		utensils[6]="Fork";
		utensils[7]="Rolling pin";
		utensils[8]="cutlery";
		utensils[9]="Measuring cup";
		utensils[11]="Frying pan";
		utensils[12]="Grater";
		utensils[13]="Peeler";
		utensils[14]="Spatula";
		utensils[15]="Cutting board";
		utensils[16]="Measuring spoon";
		utensils[17]="Bowl";
		utensils[18]="Patato masher";
		utensils[19]="Kettle";
		utensils[20]="Plate";
		utensils[21]="Mortor and Pestol";
		utensils[22]="Blender";
		utensils[23]="Chopsticks";
		utensils[24]="Sieve";
		utensils[25]="Pepper mill";
		utensils[26]="baking dish";
		utensils[27]="toastor";
		utensils[28]="Strainer";
		utensils[29]="Wok";
		utensils[30]="cooking Pot";
		utensils[31]="nutcracker";
		utensils[32]="Skimmer";
		utensils[33]="Pizza tray";
		utensils[34]="Zester";
		utensils[35]="Jar";
		utensils[36]="Oven";
		utensils[37]="Mixer";
		utensils[38]="Slicer";
		utensils[39]="Bottle";
		
		canteen.setValues("veg",utensils);
		canteen.showInfo();
		System.out.println("Ending main in CanteenMain");
	}
}
		