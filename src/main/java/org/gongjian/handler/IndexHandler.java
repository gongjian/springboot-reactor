package org.gongjian.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import reactor.core.Reactor;
import reactor.event.Event;
import reactor.spring.annotation.Selector;

@Component
public class IndexHandler {
	
	@Autowired
	@Qualifier("rootReactor")
	private Reactor reactor;
	
	@Autowired
	@Qualifier("reportReactor")
	private Reactor reactorxxx;
	
	@Selector(value = "hello", reactor="@rootReactor")
	public void handleTestTopic(Event<String> evt) {
		System.out.println("***************");
	}
	
	@Selector(value = "hellos", reactor="@reportReactor")
	public void handleTestTopics(Event<String> evt) {
		System.out.println("xxxxx************");
		String data = evt.getData();
		System.out.println(data);
	}

}
