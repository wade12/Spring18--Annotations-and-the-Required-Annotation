package com.osgo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// Shape shape = (Shape) context.getBean("triangle");			// coding to interface
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
	} // end method main

} // end Class DrawingApp
