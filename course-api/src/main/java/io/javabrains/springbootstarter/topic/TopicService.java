package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//mark this class as a spring business service (SINGLETON)
@Service
public class TopicService {
	
	private List<Topic> Topics = new ArrayList<Topic>();
	
	public TopicService()
	{
		Topics.add(new Topic(1, "CIS 430", "Computer Science Department"));
		Topics.add(new Topic(2, "CIS 202", "Computer Science Department"));
		Topics.add(new Topic(3, "CIS 412", "Computer Science Department"));
	}
	public List<Topic> getAllTopics()
	{
		return Topics;
	}
	public Topic getSpecificTopic(int id)
	{
		//lambda expression that checks for the id passed if it is equal to any of the ids
		// in any of the Topics stored in Topics then returns the first one that is found
		return Topics.stream().filter(t -> t.getID() == id).findFirst().get();
	}
	public void addTopic(Topic topic)
	{
		Topics.add(topic);
	}
	public void updateTopic(Topic topic, int id)
	{
		for(int i =0; i<Topics.size(); i++)
		{
			//if we found that topic
			if(Topics.get(i).getID() == id)
			{
				//set the topic in i that has the same id as the id passed
				//to the object topic that is passed
				Topics.set(i, topic);
			}
		}
	}
	public void deleteTopic(int id)
	{
		for (int i=0; i<Topics.size(); i++)
		{
			if(Topics.get(i).getID() ==  id)
			{
				Topics.remove(i);
				break;
			}
		}
	}

}
