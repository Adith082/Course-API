package com.example.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        //return topics;
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopicById(String id){
       //  return topics.stream()
        //         .filter(topic -> topic.getId().equals(id))
          //       .findFirst().get();
        return topicRepository.findById(id).get();
              //  .orElseThrow(() -> new Topi("Topic not found with ID: " + id));
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
      /*  for(int i = 0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }   */

        topicRepository.save(topic);
    }

    public void deleteTopic( String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}










