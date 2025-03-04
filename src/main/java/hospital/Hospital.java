package hospital;

public class Hospital {
    private int hospitalID;
    private String name;
    private String room;
    private String equipment;

    public Hospital(int hospitalID, String name, String room, String equipment) {
        this.hospitalID = hospitalID;
        this.name = name;
        this.room = room;
        this.equipment = equipment;
    }

    public int getHospitalID() { 
		return hospitalID; 
	}
	
    public void setHospitalID(int hospitalID) { 
		this.hospitalID = hospitalID; 
	}

    public String getName() { 
		return name; 
	}
	
    public void setName(String name) { 
		this.name = name; 
	}

    public String getRoom() { 
		return room; 
	}
	
    public void setRoom(String room) { 
		this.room = room; 
	}

    public String getEquipment() { 
		return equipment; 
	}
	
    public void setEquipment(String equipment) { 
		this.equipment = equipment; 
	}
}