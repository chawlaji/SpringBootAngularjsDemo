package com.springboot.main.service;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.main.model.Topic;
 
@Service
public class TopicService {
public List<Topic> topi=new ArrayList<>
(Arrays.asList(
        new Topic(1,"English",80),
        new Topic(2,"Maths",90),
        new Topic(3,"Scince",95)
        ));

 public List<Topic> getAllTopics(){
       return topi;
       }
 
public Topic getTopic(int id){
       return topi.stream().filter(t ->t.getId() == id).findFirst().get();
      
       }
 
public void addTopic(Topic topic) {
       topi.add(topic);
}
 
public void updateTopic(int idFind, Topic topicNew) {
       for (Topic topic : topi) {
    	   if(topic.getId() ==idFind){
    		   topi.set(idFind, topicNew);
    		   return;
    	   }
		
	}
      
}

public void deleteTopic(int idFind) {
    /*for (Topic topic : topi) {
 	   if(topic.getId() ==idFind){
 		   topi.remove(topic);
 		   return;
 	   }*/
		
	topi.removeIf(t ->t.getId() == idFind);
	return;
}
}