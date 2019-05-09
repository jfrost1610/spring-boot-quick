/**
 * 
 */
package com.frost.springboot.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.frost.springboot.model.Course;

/**
 * @author jobin
 *
 */
public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);

}
