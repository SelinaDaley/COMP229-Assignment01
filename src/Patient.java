
public class Patient {
	//Variables
	private int _patientId;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _city;
	private String _province;
	private String _postalCode;
	
	//Getters and setters
	public int getPatientId() {
		return _patientId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public String getAddress() {
		return _address;
	}

	public String getCity() {
		return _city;
	}

	public String getProvince() {
		return _province;
	}

	public String getPostalCode() {
		return _postalCode;
	}

	public void setPatientId(int patientId) {
		this._patientId = patientId;
	}

	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
	}

	public void setAddress(String address) {
		this._address = address;
	}

	public void setCity(String city) {
		this._city = city;
	}

	public void setProvince(String province) {
		this._province = province;
	}
	
	public void setPostalCode(String postalCode) {
		this._postalCode = postalCode;
	}

	//Constructor
	public Patient()
	{
		
	}
	
	public Patient(int patientId, String firstName, String lastName, String address, String city, String province, String postalCode) {
		_patientId = patientId;
		_firstName = firstName;
		_lastName = lastName;
		_address = address;
		_city = city;
		_province = province;
		_postalCode = postalCode;
	}
	
	//Methods
	public void getPatientInfo ()
	{
		System.out.printf("PatientID: %s, First Name: %s, Last Name: %s, "
				+ "Address: %s, City: %s, Province: %s, Postal Code: %s%n", 
				this._patientId, this._firstName, this._lastName, this._address, 
				this._city, this._province, this._postalCode);		
	}
	

}
