package com.ustglobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcesserClass implements BeanPostProcessor {
//These are the 2 default methods in BeanPostProcessor class
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean before initializaion: "+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean after initialization: "+beanName);
		return bean;
	}
	

}
