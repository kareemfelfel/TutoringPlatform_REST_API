package io.javabrains.springbootstarter.topic;

public class Topic 
{
	private int ID;
	private String Name;
	private String Description;
	
	public Topic()
	{
		
	}
	
	public Topic(int iD, String name, String description) {
		super();
		ID = iD;
		Name = name;
		Description = description;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
