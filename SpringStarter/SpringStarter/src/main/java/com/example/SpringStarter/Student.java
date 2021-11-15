package com.example.SpringStarter;

import javax.persistence.*;

//@Data
@Entity
//@Builder
@Table(name="new_student",
uniqueConstraints=@UniqueConstraint(
		name="emailed_unique",
		columnNames= "emailId"
		)
		)

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int studentId;
	private String firstName;
	private String lastName;	
	//@Column(name="emailed_address")
	private String emailId;
	private String address;
	
	public Student(String fname, String lname, String emailID, String addy) {
		this.firstName = fname;
		this.lastName = lname;
		this.emailId = emailID;
		this.address = addy;
	}
	
	@Override
	public String toString() {
		return "Student [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
}
