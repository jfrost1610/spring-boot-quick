/**
 * 
 */
package com.frost.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frost.springboot.model.Topic;

/**
 * @author jobin
 *
 */
@RestController
@RequestMapping("/topics")
public class TopicController {

	@RequestMapping(method = RequestMethod.GET)
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("hibernate", "Hibernate Framework", "Hibernate Framework Description"),
				new Topic("javascript", "JavaScript", "JavaScript Description"));
	}

}
