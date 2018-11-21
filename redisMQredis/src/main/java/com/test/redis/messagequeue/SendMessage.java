package com.test.redis.messagequeue;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;

import com.test.entity.Message;

/**
 * @describe 发送消息
 * @author yanbobo
 * @createdate 2018年9月4日 上午11:38:22
 */
public class SendMessage {
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate;

	public void sendMessage(String channel, Message message) {
		redisTemplate.convertAndSend(channel, message);
	}
}
