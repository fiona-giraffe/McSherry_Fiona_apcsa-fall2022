//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.JPG");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public Alien(int x, int y)
	{
		//add code here
		this(x, y, 30, 30, 0);
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.JPG");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public Alien(int x, int y, int s)
	{
		//add code here
		this(x, y, 30, 30, s);
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.JPG");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			//URL url = getClass().getResource("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.JPG");
			image = ImageIO.read(new File("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   //add code here
	   if(getX() > 750 || getX() < 50)
           speed = -speed;

       setX(getX() + speed);
	}

   public boolean isBetween(int x, int y, int z){
       return x >= y && x <= z;
   }
   
   public boolean isColliding(Ammo a){
       int ay = a.getY() + a.getSpeed();
       int ax = a.getX() - this.getSpeed();
       if(isBetween(ay, getY(), getY() + getHeight()) || isBetween(ay + a.getHeight(), getY(), getY() + getHeight())){
           if(isBetween(ax, getX(), getX() + getWidth()) || isBetween(ax, getX(), getX() + getWidth())){
               return true;
           }
       }
       return false;
   }
   
	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
