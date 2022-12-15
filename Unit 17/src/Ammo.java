//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean live = true;

	public Ammo()
	{
		this(0,0,5);
	}

	public Ammo(int x, int y)
	{
		//add code
		this(x,y,5);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		setPos(x,y);
		setSpeed(s);
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

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), 5, 5);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		setY(getY() - speed);
	}

	public String toString()
	{
		return "";
	}
	
	public boolean didCollide(Alien al) {
		if (getX() + 10 >= al.getX() && getX() <= al.getX() + al.getWidth()
				&& getY() - 10 >= al.getY()
				&& getY() <= al.getY() + al.getHeight()) {
			kill();
			return true;
		} else {
			return false;
		}
	}

	public boolean isAlive() {
		if (getY() < 0) {
			kill();
		}
		return live;
	}

	public void kill() {
		live = false;
	}
}
