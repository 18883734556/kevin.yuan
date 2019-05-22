package com.cc.springboot;

import com.cc.dao.TUserMapper;
import com.cc.model.TUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/say")
public class ThisWillActuallyRun {

	@Autowired
	private TUserMapper tUserMapper;
	public static final Logger logger = LogManager.getLogger(ThisWillActuallyRun.class);

	@RequestMapping("hello")
	public void home() {

		System.out.println("say hello");
		TUser tUser = new TUser();
		tUser.setName("hello");
		tUser.setPassword("666666666");
		tUserMapper.insert(tUser);

		logger.info("say:{} and say:{}", "hello", "good bye");
	}

}