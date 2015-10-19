package slo.controller;

import slo.view.SloDisplay;

public class SloController 
{
	private SloDisplay myPopups;
	
	public SloController()
	{
		myPopups = new SloDisplay();
	}
	
	public void start()
	{

		String temp = myPopups.grabAnswer("Type in your grade");
		int myGrade;
		
		while(!isInteger(temp))
		{
			temp = myPopups.grabAnswer("Type in a positive integer for your grade");
		}
		if(isInteger(temp))
		{
			myGrade = Integer.parseInt(temp);
		}
		else
		{
			myGrade = -9999999;
		}

		
		myPopups.showResponse("You are in " + temp + " Grade");
		
		
		String tempGPA = myPopups.grabAnswer("Type in your GPA");
		double myGPA;
		
		while(!isDouble(tempGPA))
		{
			temp = myPopups.grabAnswer("Type in a positive integer for your GPA");

		}
		if(isDouble(tempGPA))
		{
			myGPA = Double.parseDouble(tempGPA);
		}
		else
		{
			myGPA = -9999.99;
		}
		
		myPopups.showResponse("Your GPA is " + myGPA);
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double tempGPA = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double - bad value will be used");
		}
		
		return isDouble;
	}
}
