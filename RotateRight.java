class RotateRight
{
	static void rotate()
	{
		int age[]={10,20,30,40,50};
		for(int i=0;i<age.length;i++)
		{
		
		System.out.println(age[i]);
		}
		System.out.println("after rotating");
		System.out.println("rotated array:"+age[3]+" " +age[4] +" "+age[0]+" " +age[1]+" " +age[2] );
		
	}
	public static void main(String[] args)
	{
		System.out.println("Starting main in RotateRightMain");
		
		RotateRight.rotate();
		System.out.println("Ending main in RotateRightMain");
	}
}

			
			