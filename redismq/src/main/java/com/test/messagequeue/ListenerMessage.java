package com.test.messagequeue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @describe 订阅者
 * @author yanbobo
 * @createdate 2018年9月4日 上午11:31:41
 */
public class ListenerMessage implements MessageListener {

	@Autowired
	private RedisTemplate<String, String> redisTemplate	;

	public void onMessage(Message message, byte[] abyte0) {
		String s = redisTemplate.opsForList().rightPop("task-queue");
		System.out.println(s+"被清除");
	}

}
