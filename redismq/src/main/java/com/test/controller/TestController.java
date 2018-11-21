package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.Message;
import com.test.messagequeue.SendMessage;

/**
 * @describe 测试controller
 * @author yanbobo
 * @createdate 2018年9月4日 上午11:44:58
 */
@Controller
@RequestMapping(value="/test")
public class TestController {

//	@Autowired
//	SendMessage sendMessage;
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate	;

	@RequestMapping(value = "/redis")
	public String redis() {
		
		for (int i = 0; i < 1000; i++) {
//			System.out.println(i);
			Message msg = new Message();
			msg.setName("Tom"+i);
//			sendMessage.sendMessage("java", msg);
			redisTemplate.opsForList().leftPush("task-queue", msg);
		}
		return "index";
	}
}
