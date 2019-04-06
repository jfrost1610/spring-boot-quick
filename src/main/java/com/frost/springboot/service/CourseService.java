/**
 * 
 */
package com.frost.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.springboot.model.Course;
import com.frost.springboot.repo.CourseRepository;

/**
 * @author jobin
 *
 */
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public void createCourse(Course topic) {
		courseRepository.save(topic);
	}

	public void updateCourse(Course topic) {
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
