package com.van.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class AppListener implements HttpSessionAttributeListener, HttpSessionListener {
	
	public AppListener(){
		System.out.println("AppListener被创建");
	}
	
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("添加属性："+se.getName() + "," + se.getValue());
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("移除属性："+se.getName() + "," + se.getValue());
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("替换属性："+se.getName() + "," + se.getValue());
	}

	public void sessionCreated(HttpSessionEvent e) {
		System.out.println("创建Session："+e.getSession().getId());
	}

	public void sessionDestroyed(HttpSessionEvent e) {
		System.out.println("销毁Session："+e.toString());
	}

}
