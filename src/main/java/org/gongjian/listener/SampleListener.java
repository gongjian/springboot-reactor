package org.gongjian.listener;

import org.gongjian.event.SampleEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<SampleEvent> {

	@Override
	public void onApplicationEvent(SampleEvent evt) {
		System.out.println("&&&&&&&&&&&&&&");
		System.out.println(evt.getSource());
	}


}
