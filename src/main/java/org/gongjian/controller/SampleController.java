package org.gongjian.controller;

import org.gongjian.event.SampleEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;
	
	@RequestMapping("/sample")
	public void sample() {
		System.out.println("publish event");
		applicationContext.publishEvent(new SampleEvent<String>("OOXX"));
	}
	

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		applicationContext = context;
	}

}
