/*
 * Noah Alonso-Torres
 * HW7
 * Nemo Fish Tank
 */

import java.awt.*;
import java.net.URL;


public class Fish {
	
	public int FISH_BOX_SIZE = 100; //Size of square surrounding Fish1
	private double x, y;
	private double direction = Math.random()*360;
	private double speed;
	
	private Image fish;
	
	//OBJECT SPECIFIC VARIABLES
		public String fishR;
		public String fishL;
		public int rightBumper = 940;
		public int bottomBumper = 550;
	//OBJECT SPECIFIC VARIABLES
	
	public Fish(String imgR, String imgL, int topSpeed) {
		//START FACING IN THE RIGHT DIRECTION
		if (direction < 90 || direction > 270 && direction < 360) {//Moving right, face right
			URL url = getClass().getResource(imgR);
			fish = Toolkit.getDefaultToolkit().getImage(url);
		}
		else {									//Moving left face left
			URL url = getClass().getResource(imgL);	
			fish = Toolkit.getDefaultToolkit().getImage(url);
		}
		//END OF START FACING IN THE RIGHT DIRECTION
		
		speed = topSpeed;
		
		x = Math.random()*400;
		y = Math.random()*200;
	}

	public void swim(){
		//Create random movement
		x = x + speed*Math.cos(Math.toRadians(direction));
		y = y + speed*-Math.sin(Math.toRadians(direction));
		//Bounce off walls
		if (x < 0 || x > rightBumper) direction = 180-direction;
		if (y < 0 || y > bottomBumper) direction = -direction;
		//Flip Image on Bounce
		if (x < 0) {
			URL url = getClass().getResource(fishR);
			fish = Toolkit.getDefaultToolkit().getImage(url);
		}
		if (x > rightBumper) {
			URL url = getClass().getResource(fishL);
			fish = Toolkit.getDefaultToolkit().getImage(url);
		}
	}
	
	public void draw(Graphics graphics) {
		swim();
		graphics.drawImage(fish, (int)x, (int)y, FISH_BOX_SIZE, FISH_BOX_SIZE, null);
	}
	

}
