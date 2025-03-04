package hospital;

public class Patient {
    private String ssn;
    private String name;
    private String dateOfBirth;
    private String address;
    private String phone;
    private String medicalConditions;

    public Patient(String ssn, String name, String dateOfBirth, String address, String phone, String medicalConditions) {
        this.ssn = ssn;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.medicalConditions = medicalConditions;
    }

    public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDateOfBirth() { 
		return dateOfBirth; 
	}
	
    public void setDateOfBirth(String dateOfBirth) { 
		this.dateOfBirth = dateOfBirth; 
	}

    public String getAddress() { 
		return address; 
	}
	
    public void setAddress(String address) { 
		this.address = address; 
	}

    public String getPhone() { 
		return phone; 
	}
	
    public void setPhone(String phone) { 
		this.phone = phone; 
	}

    public String getMedicalConditions() { 
		return medicalConditions; 
	}
	
    public void setMedicalConditions(String medicalConditions) { 
		this.medicalConditions = medicalConditions; 
	}
}