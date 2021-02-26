package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	// marks this as a Singleton
	@Autowired
	private TopicService topicServer;
	
	//get request 
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicServer.getAllTopics();
	}
	
	//mapping to topic ID that is passed as a variable
	@RequestMapping("/topics/{id}")
	//Get the variable that is passed from mapping to the function getTopic
	public Topic getTopic(@PathVariable int id)
	{
		return topicServer.getSpecificTopic(id);
	}
	
	//Map this method to any post in /topics
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	//getting the body of the POST method and converts it to a topic object
	public void addTopic(@RequestBody Topic topic)
	{
		//add a topic to the topic server
		topicServer.addTopic(topic);
	}
	
	//update topic through a put request
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable int id)
	{
		topicServer.updateTopic(topic, id);
	}
	
	//Delete topic through a delete request
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable int id)
	{
		topicServer.deleteTopic(id);
	}

}
