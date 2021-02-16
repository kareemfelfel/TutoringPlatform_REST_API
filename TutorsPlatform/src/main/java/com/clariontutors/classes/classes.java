package com.clariontutors.classes;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public class classes 
{
	@Id
	private String class_id;
	private String name;
	public classes(String id, String name) {
		super();
		this.class_id = id;
		this.name = name;
	}
	public classes()
	{
		
	}
	
	public String getId() {
		return class_id;
	}
	public void setId(String id) {
		this.class_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
