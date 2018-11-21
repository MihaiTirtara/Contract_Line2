package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Adress_Id")
	int id;
	private String city;
	private int postNo;
	@Column(name="Street_Name")
	private String strName;
	@Column(name="Street_Number")
	private int strNum;
	
	public Adress(int id,String city, int postNo, String strName, int strNum) 
	{
		this.id = id;
		this.city = city;
		this.postNo = postNo;
		this.strName = strName;
		this.strNum = strNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getStrNum() {
		return strNum;
	}

	public void setStrNum(int strNum) {
		this.strNum = strNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	

}
