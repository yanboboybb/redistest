package com.example.redis.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.redis.entity.Business;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
//		UserDao userDAO = (UserDao) ac.getBean("userDao");
//		User user = new User();
//		user.setId(2);
//		user.setName("项目");
//		userDAO.saveUser(user);
//		//
//		User liuxg = userDAO.getUser(2);
//		System.out.println(liuxg.getName());
		Gson gson=new Gson();
		String businessString = String.valueOf(RedisUtils.hmGet("businessId", "businessId"+150));
		System.out.println(businessString);
        Business business = gson.fromJson(businessString, Business.class);
//        System.out.println(business.toString());

	}
}
