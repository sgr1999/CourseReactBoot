package com.example.controller;

import java.util.List;

import com.example.Entites.Course;
import com.example.servises.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        System.out.println(course);
        Course save = courseService.addCourse(course);
        return save;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getAllCourse")
    public List<Course> getAllCourse(Course course) {
        System.out.println(course);
        List<Course> save = courseService.getAllCourse(course);

        return save;
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getCourse/{id}")
    public Course getCourseById(@PathVariable("id") Long id) {

       Course c= courseService.getCourseById(id);
       System.out.println(c);
       return c;

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updateCourse/{id}")
    public Course updateCourse(@RequestBody Course course,@PathVariable("id") Long id) {

       Course c= courseService.updateCourse(course, id);
       System.out.println(c);
       return c;

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/deleteCourse/{id}")
    public void deleteCourse(@PathVariable("id") Long id) {

        courseService.deleteCourse(id);

    }

}
