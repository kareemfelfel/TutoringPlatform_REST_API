package com.clariontutors.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//mark this class as a spring business service (SINGLETON)
@Service
public class userServices 
{
	//get the instance of the singleton class userRepository
	@Autowired
	private userRepository uRepository;
	
	//ArrayList of all users
	private ArrayList<user> allUsers;
	
	public List<user> getAllUsers()
	{
		//initialize all users
		allUsers = new ArrayList<user>();
		//lambda expression that uses the findall function of the user repository and
		//itterates over it to add every object of type user to allUsers
		uRepository.findAll().forEach(allUsers::add);
		return allUsers;
	}
	public user getUser(String id)
	{
		//useless Lambda expression here, but could be used later.
		//return allUsers.stream().filter(u -> u.getId().equals(id)).findFirst().get();
		return uRepository.findById(id).get();
		
	}
	public void addUser(user u)
	{
		//saves the passed user to the repository
		uRepository.save(u);
	}
	public void updateUser(user u)
	{
		//since the ID is the key, it will update the data for the chosen user
		uRepository.save(u);
	}
	public void deleteUser(String id)
	{
		uRepository.deleteById(id);
	}
	
}
