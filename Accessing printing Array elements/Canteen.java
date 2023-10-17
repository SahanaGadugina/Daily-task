class Canteen
{
	String type;
	String[] utensils;
	void setValues(String type,String[] utensils)
	{
		this.type=type;
		this.utensils=utensils;
	}
	void showInfo()
	{
		if(this.utensils!=null)
		{
			for(int seq=0;seq<this.utensils.length;seq++)
			{
				String ref=this.utensils[seq];
				System.out.println("Utensil name:"+ref +" at "+seq);
			}
		}
	}
}