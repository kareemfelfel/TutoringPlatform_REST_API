package com.clariontutors.classes;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

//Crud is generic type so it can return whatever datatype I send to it
//first parameter is the entity class. In this case, it is classes_tutors
//Second parameter is the datatype of the Id or the key
public interface classes_Tutors_Repository extends CrudRepository<classes_tutors, String>{
	//key element here is the name:
	//findBy looks through fields in the table so it goes to "tutor" then "Id"
	// under tutor
	public ArrayList<classes_tutors> findByTutorId(String UserId);

}
