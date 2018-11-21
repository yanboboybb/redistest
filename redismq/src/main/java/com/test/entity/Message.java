package com.test.entity;

import java.io.Serializable;

/**
 * @describe 消息存储实体
 * @author yanbobo
 * @createdate 2018年9月4日 上午11:13:21
 */
public class Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2458715899368737093L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLiveCity() {
		return liveCity;
	}

	public void setLiveCity(String liveCity) {
		this.liveCity = liveCity;
	}

	private String age;
	private String liveCity;

}
