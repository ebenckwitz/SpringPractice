package com.example.SpringStarter;

import javax.persistence.*;

@Data
@Entity
@Builder
@Table(name="new_student",
uniqueConstraints=@UniqueConstraint(
		name="emailed_unique",
		columnNames="emailId"
		)
		)

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long studentId;
	private String firstName;
	private String lastName;	
	//@Column(name="emailed_address")
	private String emailId;
	
	public Student(String fname, String lname, String emailID) {
		this.firstName = fname;
		this.lastName = lname;
		this.emailId = emailID;
	}
	
	@Override
	public String toString() {
		return "Student [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
