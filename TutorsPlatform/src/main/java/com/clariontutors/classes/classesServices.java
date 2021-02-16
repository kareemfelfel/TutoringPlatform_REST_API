package com.clariontutors.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clariontutors.users.user;
import com.clariontutors.users.userRepository;

//mark this class as a spring business service (SINGLETON)
@Service
public class classesServices 
{
	//get the instance of the singleton class classes tutors repository
	@Autowired
	private classes_Tutors_Repository cRepository;
	//get the instance of the singleton class classes professors repository
	@Autowired
	private classes_professors_Repository pRepository;
	
	//function that returns a list of all classes for a single tutor
	public ArrayList<classes_tutors> getTutorClasses(String T_Id)
	{
		//create a new empty array list
		ArrayList<classes_tutors> TutorClasses = new ArrayList<classes_tutors>();
		//use the findby tutor Id function that I created and store each class in tutor classes array
		cRepository.findByTutorId(T_Id).forEach(TutorClasses::add);
		return TutorClasses;
		
	}
	public ArrayList<classes_professors> getProfessorClasses(String prof_Id)
	{
		//create a new empty array list
		ArrayList<classes_professors> ProfessorClasses = new ArrayList<classes_professors>();
		//use the findby professor Id function that I created and store each class in professor classes array
		pRepository.findByProfessorId(prof_Id).forEach(ProfessorClasses::add);
		return ProfessorClasses;
		
	}
	public void addTutorClass(classes_tutors c)
	{
		cRepository.save(c);
	}
	public void addProfessorClass(classes_professors c)
	{
		pRepository.save(c);
	}

}
