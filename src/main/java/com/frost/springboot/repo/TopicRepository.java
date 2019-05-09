/**
 * 
 */
package com.frost.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.frost.springboot.model.Topic;

/**
 * @author jobin
 *
 */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
