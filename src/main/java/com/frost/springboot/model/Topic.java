/**
 * 
 */
package com.frost.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jobin
 *
 */
@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;

	public Topic() {

	}

	/**
	 * @param id
	 */
	public Topic(String id) {
		super();
		this.id = id;
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
