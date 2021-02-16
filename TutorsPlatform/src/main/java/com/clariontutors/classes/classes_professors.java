package com.clariontutors.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.clariontutors.users.user;

//a table will be made out of this class
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "classes_professors")
public class classes_professors
{
	//this initiates that many classes could be linked to one professor
	@ManyToOne
	//create column name professor. This is used by the repository to find column
	@JoinColumn(name="professor", nullable=false)
	private user professor;
	@Id
	private String class_id;
	private String name;
	
	public classes_professors()
	{
		
	}
	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public user getProfessor() {
		return professor;
	}

	public void setProfessor(user t) {
		professor = t;
	}

	public classes_professors(String id, String name) {
		this.name = name;
		this.class_id = id;
	
	}

}
