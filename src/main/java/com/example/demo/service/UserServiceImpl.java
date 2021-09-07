package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;

@Service(version = "1.0.0",application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}")
public class UserServiceImpl implements IUserService {

	@Override
	public JSONObject getUserName(String name) {
		System.out.println("---");
		System.out.println(name);
		JSONObject json = new JSONObject();
		json.put("name",name);
		return json;
	}

}
