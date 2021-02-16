package com.clariontutors.classes;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.clariontutors.users.user;

//table is created of this class
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "classes_tutors")
public class classes_tutors
{
	//tutor could have more than one class tutoring
	@ManyToOne
	//name of field that will be used by the JPA to get the field tutor from table
	@JoinColumn(name="tutor", nullable=false)
	private user tutor;
	@Id
	private String class_id;
	private String name;
	
	public classes_tutors()
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

	public user getTutor() {
		return tutor;
	}

	public void setTutor(user t) {
		tutor = t;
	}

}
