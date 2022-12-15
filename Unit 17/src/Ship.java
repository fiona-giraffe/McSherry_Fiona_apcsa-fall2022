//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x, y, 100, 100, 5);
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x, y, 100, 100, s);
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public boolean didCollide(Alien al) {
		if (getX() + getWidth()-30 >= al.getX() && getX() <= al.getX() + al.getWidth()-30
				&& getY() + getHeight()-30 >= al.getY()
				&& getY() <= al.getY() + al.getHeight()-30) {
			return true;
		} else {
			return false;
		}
	}
	
	public void move(String direction)
	{
		//add code here
		if(direction.equalsIgnoreCase("LEFT")) {
			setX(getX()-speed);
		}
		if(direction.equalsIgnoreCase("RIGHT")) {
			setX(getX() + speed);
		}
		if(direction.equalsIgnoreCase("UP")) {
			setY(getY() - speed);
		}
		if(direction.equalsIgnoreCase("DOWN")) {
			setY(getY()+speed);
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
