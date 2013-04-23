package com.osgo;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape
{
	private Point centre;
	
	public void draw()
	{
		System.out.println("Drawing Circle.");
		System.out.println("Circle with centre point at:" +"(" + centre.getX() + ", " + centre.getY() + ")" );
		
	} // end method draw

	public Point getCentre()
	{
		return centre;
	} // end method getCentre

	@Required
	// tells Spring that this is a required member variable
	// i.e. some value has to be assigned to the centre member variable when the bean is being initialised
	// if value is not there, then throw an exception (i.e. exception thrown when the application is being initialised)
	// (thus, error can be detected up front, as opposed to being detected at runtime).
	public void setCentre(Point centre)
	{
		this.centre = centre;
	} // end method setCentre

	
} // end Class Circle
