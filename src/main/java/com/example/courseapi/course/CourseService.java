package com.example.courseapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        //return topics;
      //  courseRepository.findAll().forEach(courses::add);
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourseById(String id){
       //  return topics.stream()
        //         .filter(topic -> topic.getId().equals(id))
          //       .findFirst().get();
        return courseRepository.findById(id).get();
              //  .orElseThrow(() -> new Topi("Topic not found with ID: " + id));
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
      /*  for(int i = 0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }   */

        courseRepository.save(course);
    }

    public void deleteCourse( String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}










