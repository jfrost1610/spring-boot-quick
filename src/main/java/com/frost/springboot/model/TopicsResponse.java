/**
 * 
 */
package com.frost.springboot.model;

import java.util.List;

/**
 * @author jobin
 *
 */
public class TopicsResponse {

	List<Topic> topics;

	/**
	 * @return the topics
	 */
	public List<Topic> getTopics() {
		return topics;
	}

	/**
	 * @param topics
	 *            the topics to set
	 */
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

}
