package net.nra.candb.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name")
	private String firstname;

	
	@Column(name="last_name")
	private String lastname;

	
	@Column(name="email_id")
	private String emailId;
	
	public Employee() {
		
	}
	
	
	public Employee(long id, String firstname, String lastname, String emailId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
}
