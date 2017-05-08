package com.springboot.main.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.model.Topic;
import com.springboot.main.service.TopicService;
 
@RestController
public class TopicController {
      
       @Autowired
       private TopicService topicService;
 
       @RequestMapping("/topics")
       public List<Topic> getAllTopics(){
              return topicService.topi;
             
       }
 
       @RequestMapping("/topic/{id}")
       public Topic getTopic(@PathVariable int id){
              return topicService.getTopic(id);
             
       }
      
       @RequestMapping(method=RequestMethod.POST, value="/topic")
       public void addTopic(@RequestBody Topic topic){
              topicService.addTopic(topic);
             
       }
      
       @RequestMapping(method=RequestMethod.PUT, value="/topic/{id}")
       public void updateTopic(@RequestBody Topic topic,@PathVariable int id){
              topicService.updateTopic(id,topic);
             
       }

       @RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")
       public void deleteTopic(@RequestBody Topic topic,@PathVariable int id){
              topicService.deleteTopic(id);
             
       }
}