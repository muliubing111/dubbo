
package com.itmayiedu.service.impl;

import com.itmayiedu.service.UserService;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

	public String getUserId(Integer id) {
		System.out.println("被客户端(消费者)消费....id:" + id);
		if (id == 1) {
			return "1";
		}
		if (id == 2) {
			return "2";
		}
		if (id == 1) {
			return "3";
		}
		return "未找到...";

	}

	 Map<String, Method> map = new HashMap();
	public  void getValue(){
		try {
			Class clazz = this.getClass();
			Method[] methods = clazz.getDeclaredMethods();
			for(Method m : methods){
				m.setAccessible(true);
				map.put(m.getName(),m);
				System.out.println(m.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public static void main(String[] args){
	UserServiceImpl us = new UserServiceImpl();
	us.getValue();
}
}
