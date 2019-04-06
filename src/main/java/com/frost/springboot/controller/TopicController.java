/**
 * 
 */
package com.frost.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frost.springboot.model.Topic;
import com.frost.springboot.service.TopicService;

/**
 * @author jobin
 *
 */
@RestController
@RequestMapping("/topics")
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

}
