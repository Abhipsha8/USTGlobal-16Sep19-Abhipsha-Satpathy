package com.ustglobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcesserClass implements BeanFactoryPostProcessor {
  //only once before initialization phase BeanPostProcesser
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcesser Executing ");
		
	}
	

}
