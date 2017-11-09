package org.gongjian.event;

import org.springframework.context.ApplicationEvent;

public class SampleEvent<T> extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public SampleEvent(T source) {
		super(source);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getSource() {
		return (T) super.getSource();
	}

}
