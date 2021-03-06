/**
 * 
 */
package com.frost.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.frost.springboot.model.Topic;
import com.frost.springboot.repo.TopicRepository;

/**
 * @author jobin
 *
 */
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void createTopic(Topic topic) throws Exception {
		if (StringUtils.isEmpty(topic.getId())) {
			throw new Exception("Topic Id cannot be empty!");
		}
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
