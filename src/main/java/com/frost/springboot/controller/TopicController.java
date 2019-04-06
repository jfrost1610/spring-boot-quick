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

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void getTopic(@RequestBody Topic topic) {
		topicService.createTopic(topic);
	}

}
