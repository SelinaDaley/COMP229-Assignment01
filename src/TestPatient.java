
public class TestPatient {

	public static Patient patient;
	
	public static void main(String[] args) {
		
		Patient patient1 = new Patient();
		patient1.setPatientId(100);
		patient1.setFirstName("Patient");
		patient1.setLastName("1");
		patient1.setAddress("100 Star Drive");
		patient1.setCity("Toronto");
		patient1.setProvince("Ontario");
		patient1.setPostalCode("M1B 2T4");

		Patient patient2 = new Patient(101, "Patient", "2", "101 Star Drive", "Toronto", "Ontario", "M1B 2R4");
		
		patient1.getPatientInfo();
		patient2.getPatientInfo();
		
	}

}
