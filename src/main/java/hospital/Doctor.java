package hospital;

public class Doctor extends Staff {
    private String patientAssignedSSN;

    public Doctor(int employeeID, String name, String address, String phone, String patientAssignedSSN) {
        super(employeeID, name, address, phone);
        this.patientAssignedSSN = patientAssignedSSN;
    }
	
    public String getPatientAssignedSSN() { 
		return patientAssignedSSN; 
	}
	
    public void setPatientAssignedSSN(String patientAssignedSSN) { 
		this.patientAssignedSSN = patientAssignedSSN; 
	}
}