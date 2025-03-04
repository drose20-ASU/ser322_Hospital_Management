package hospital; 

public class Staff {
    protected int employeeID;
    protected String name;
    protected String address;
    protected String phone;

    public Staff(int employeeID, String name, String address, String phone) {
        this.employeeID = employeeID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    
	public int getEmployeeID() { 
		return employeeID; 
	}
    public void setEmployeeID(int employeeID) { 
		this.employeeID = employeeID; 
	}

    public String getName() { 
		return name; 
	}
	
    public void setName(String name) { 
		this.name = name; 
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
}