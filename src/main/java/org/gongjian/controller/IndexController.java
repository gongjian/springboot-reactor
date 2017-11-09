package org.gongjian.controller;

import org.gongjian.event.SampleEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.Reactor;
import reactor.event.Event;

@RestController
@RequestMapping("/reactor")
public class IndexController {
	
	@Autowired
	@Qualifier("rootReactor")
	private Reactor r;
	
	@Autowired
	@Qualifier("reportReactor")
	private Reactor rx;

	@RequestMapping("/hello")
	public void hello() {
		r.notify("hello", Event.wrap("你好"));
	}
	
	@RequestMapping("/hellos")
	public void hellos() {
		rx.notify("hellos", Event.wrap("好"));
	}
	
	@RequestMapping("/sample")
	public void sample() {
		System.out.println("reactor");
		r.notify(new SampleEvent<String>("123"));
	}
}
