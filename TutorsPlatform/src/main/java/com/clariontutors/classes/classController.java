package com.clariontutors.classes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clariontutors.*;
import com.clariontutors.users.user;
import com.clariontutors.users.userServices;

@RestController
public class classController 
{
	// marks this as a Singleton
	@Autowired
	private userServices userServer;
	@Autowired
	private classesServices cServer;
	
	
	@RequestMapping("/users/tutors/{id}/classes")
	public ArrayList<classes_tutors> getTutorClasses(@PathVariable String id)
	{
		if(userServer.getUser(id).isIs_tutor())
		{
			return cServer.getTutorClasses(id);
			
		}
		return null;
	}
	@RequestMapping("/users/professors/{id}/classes")
	public ArrayList<classes_professors> getProfessorClasses(@PathVariable String id)
	{
		
		if (userServer.getUser(id).isIs_professor())
		{
			return cServer.getProfessorClasses(id);
		}
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/users/tutors/{User_Id}/classes")
	public void addTutorClass(@PathVariable String User_Id, @RequestBody classes_tutors c)
	{
		if(userServer.getUser(User_Id).isIs_tutor())
		{
			c.setTutor(userServer.getUser(User_Id));
			cServer.addTutorClass(c);
		}
		
	}
	@RequestMapping(method = RequestMethod.POST, value="/users/professors/{User_Id}/classes")
	public void addProfessorClass(@PathVariable String User_Id, @RequestBody classes_professors p)
	{
		if(userServer.getUser(User_Id).isIs_professor())
		{
			p.setProfessor(userServer.getUser(User_Id));
			cServer.addProfessorClass(p);
		}
		
		
	}

}
