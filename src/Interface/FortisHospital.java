package Interface;

public class FortisHospital extends Medicines implements USMedical, UKMedical 
{

	@Override
	public void covid19Checkup() {
		System.out.println("Fortis Hospital Covid19 Checkup");
		
	}

	@Override
	public void generalCheckup() {
		System.out.println("USMedical...FortisHospital General Checkup");
		
	}

	@Override
	public void pediatricCheckup() {
		System.out.println("USMedical...FortisHospital Pediatric Checkup");
		
	}

	@Override
	public void orthoCheckup() {
		System.out.println("UKMedical...FortisHospital Ortho Checkup");
		
	}

	@Override
	public void dentalCheckup() {
		System.out.println("UKMedical...FortisHospital dental Checkup");
		
	}
	
	public void pathologyCheckup()
	{
		System.out.println("FortisHospital...Pathology Checkup");
	}
}
