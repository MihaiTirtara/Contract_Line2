package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account 
{
	@Id
	private String id;
	private String password;
	private String phoneNumber;
	@Column(name="First_Name")
	private String fName;
	@Column(name="Last_Name")
	private String lName;
	
	public Account(String id, String password, String phoneNumber, String fName, String lName) 
	{
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.fName = fName;
		this.lName = lName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	

}
