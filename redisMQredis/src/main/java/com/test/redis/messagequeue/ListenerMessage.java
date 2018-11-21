package com.test.redis.messagequeue;

import com.test.entity.Message;

/** 
* @describe 订阅者
* @author yanbobo 
* @createdate 2018年9月4日 上午11:31:41 
*/
public class ListenerMessage {
	
	public void handleMessage(Message message){
		System.out.println(message.getName());
	}

}
