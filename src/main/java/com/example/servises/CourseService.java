package com.example.servises;

import java.util.List;
import java.util.Optional;

import com.example.Entites.Course;
import com.example.dao.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course){

       Course save = courseRepository.save(course);
       return save;
    }

    public List<Course> getAllCourse(Course course){

        List<Course> save = courseRepository.findAll();
        return save;
     }
    
    public Course getCourseById(Long id){

        Course save = courseRepository.getById(id);
        return save;
     }

    //Update
     public Course updateCourse(Course course,Long id){
      Course c = courseRepository.getById(id);
    
      c.setId(course.getId());
      c.setDescription(course.getDescription());
      c.setTitle(course.getTitle());

     Course co= courseRepository.save(c);
     return co;
  }

     public void deleteCourse(Long id){
       courseRepository.deleteById(id);
     
   }
}
