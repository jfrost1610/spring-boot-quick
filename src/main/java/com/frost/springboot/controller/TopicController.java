/**
 * 
 */
package com.frost.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frost.springboot.model.Topic;
import com.frost.springboot.model.TopicsResponse;
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
	public TopicsResponse getAllTopics() {
		TopicsResponse response = new TopicsResponse();
		response.setTopics(topicService.getAllTopics());
		return response;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createTopic(@RequestBody Topic topic) throws Exception {
		topicService.createTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic) {
		topicService.updateTopic(topic);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
