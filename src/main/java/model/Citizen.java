package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Citizen 
{
	@Id
	public String id;
	@Column(name="First_Name")
	public String fName;
	@Column(name="Last_Name")
	public String lName;
	
	public Citizen(String id, String fName, String lName)
	{
		this.id = id;
		this.fName = fName.toLowerCase();
		this.lName = lName.toLowerCase();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName.toLowerCase();
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName.toLowerCase();
	}
	
	
	
	

}
