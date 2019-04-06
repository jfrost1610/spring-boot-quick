/**
 * 
 */
package com.frost.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.frost.springboot.model.Topic;

/**
 * @author jobin
 *
 */
@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("hibernate", "Hibernate Framework", "Hibernate Framework Description"),
			new Topic("javascript", "JavaScript", "JavaScript Description"));

	public List<Topic> getAllTopics() {
		return topics;
	}

}
