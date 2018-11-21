package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.Message;
import com.test.redis.messagequeue.SendMessage;

/**
 * @describe 测试controller
 * @author yanbobo
 * @createdate 2018年9月4日 上午11:44:58
 */
@Controller
@RequestMapping(value="/test")
public class TestController {

	@Autowired
	SendMessage sendMessage;

	@RequestMapping(value = "/redis")
	public String redis() {
		
		for (int i = 0; i < 1000; i++) {
			Message msg = new Message();
			msg.setName("Tom"+i);
			sendMessage.sendMessage("java", msg);
			System.out.println("发布第"+i+"条");
		}
		return "index";
	}
}
