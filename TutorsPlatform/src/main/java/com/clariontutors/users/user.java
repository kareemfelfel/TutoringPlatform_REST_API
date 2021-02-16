package com.clariontutors.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//This creates a table of users called user_account
@Entity
@Table(name = "user_account")
public class user {
	//makes this key primary. @Id can be used on any field to make it primary
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private boolean is_student;
	private boolean is_tutor;
	private boolean is_professor;
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isIs_student() {
		return is_student;
	}
	public void setIs_student(boolean is_student) {
		this.is_student = is_student;
	}
	public boolean isIs_tutor() {
		return is_tutor;
	}
	public void setIs_tutor(boolean is_tutor) {
		this.is_tutor = is_tutor;
	}
	public boolean isIs_professor() {
		return is_professor;
	}
	public void setIs_professor(boolean is_professor) {
		this.is_professor = is_professor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
