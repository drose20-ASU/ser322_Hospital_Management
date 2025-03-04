package hospital;

public class Nurse extends Staff {
    private String roomAssignment;

    public Nurse(int employeeID, String name, String address, String phone, String roomAssignment) {
        super(employeeID, name, address, phone);
        this.roomAssignment = roomAssignment;
    }

    public String getRoomAssignment() { 
		return roomAssignment; 
	}
	
    public void setRoomAssignment(String roomAssignment) { 
		this.roomAssignment = roomAssignment; 
	}
}