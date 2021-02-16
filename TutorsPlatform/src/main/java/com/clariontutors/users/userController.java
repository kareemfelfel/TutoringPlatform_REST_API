package com.clariontutors.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clariontutors.classes.classes;

@RestController
public class userController 
{
		// marks this as a Singleton
		@Autowired
		private userServices userServer;
		
		//get request 
		@RequestMapping("/users")
		public List<user> getAllUsers()
		{
			return userServer.getAllUsers();
		}
		
		//mapping to users ID that is passed as a variable
		@RequestMapping("/users/{id}")
		//Get the variable that is passed from mapping to the function getTopic
		public user getUser(@PathVariable String id)
		{
			return userServer.getUser(id);
		}
		
		//Map this method to the post request for /users
		@RequestMapping(method = RequestMethod.POST, value="/users")
		//getting the body of the POST method and converts it to a topic object
		public void addUser(@RequestBody user u)
		{
			//add a topic to the topic server
			userServer.addUser(u);
		}
		
		//update user through a put request
		@RequestMapping(method = RequestMethod.PUT, value="/topics/")
		public void updateUser(@RequestBody user u)
		{
			userServer.updateUser(u);
		}
		
		//Delete user through a delete request
		@RequestMapping(method = RequestMethod.DELETE, value="/user/{id}")
		public void deleteTopic(@PathVariable String id)
		{
			userServer.deleteUser(id);
		}

}
