package Interface;

public class Test {

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital();
		fs.generalCheckup();
		fs.pediatricCheckup();
		USMedical.elderCheckup();
		fs.billing();
		fs.dentalCheckup();
		fs.orthoCheckup();
		fs.covid19Checkup();
		fs.generalMedicines();

		USMedical usm = new FortisHospital();
		usm.generalCheckup();
		usm.pediatricCheckup();
		usm.billing();
		usm.covid19Checkup();
				
	}

}
