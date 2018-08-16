package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0", application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}")
public class UserServiceImpl implements IUserService {

	@Override
	public String getUserName() {

		return "hello world";
	}

}
