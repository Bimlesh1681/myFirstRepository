package Interface;

public interface USMedical extends WHO
{
	int councelling_fee=100;
	
	public void generalCheckup();
	public void pediatricCheckup();
	
	public static void elderCheckup()
	{
		System.out.println("US Medical Elder Checkup");
	}
	
	default void billing()
	{
		System.out.println("Default billing is 100");
	}

}
