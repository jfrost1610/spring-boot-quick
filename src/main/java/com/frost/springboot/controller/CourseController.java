/**
 * 
 */
package com.frost.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frost.springboot.model.Course;
import com.frost.springboot.model.Topic;
import com.frost.springboot.service.CourseService;

/**
 * @author jobin
 *
 */
@RestController
@RequestMapping("topics/{topicId}/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createCourse(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId));
		courseService.createCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void updateCourse(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId));
		courseService.updateCourse(course);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}

}
