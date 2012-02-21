/*
 * Noah Alonso-Torres
 * HW7
 * Nemo Fish Tank
 */

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

//public class FishTank extends JComponent implements Runnable {
public class FishTank extends JComponent {
	
	public static final int TANK_SIZE_WIDTH = 1024;  //Dimension width of tank
	public static final int TANK_SIZE_HEIGHT = 768; //Dimension height of tank
	
	private Image tankPic, coralR, coralL, coralM; //storing the tank picture
	private Fish fish1 = new Fish("fishR.png" , "fishL.png", 10);
	private Fish fish2 = new Fish("fish2R.png" , "fish2L.png", 10);
	private Fish fish3 = new Fish("fish3R.png" , "fish3L.png", 5);
	private Fish fish4 = new Fish("dadR.png" , "dadL.png", 10);

	public void nameFish() {
		fish4.fishR = "dadR.png";
		fish4.fishL = "dadL.png";
			fish4.FISH_BOX_SIZE = 200;
			fish4.rightBumper = 950;
			fish4.bottomBumper = 350;		
		
		fish3.fishR = "fish3R.png";
		fish3.fishL = "fish3L.png";
			fish3.FISH_BOX_SIZE = 180;
			fish3.rightBumper = 950;
			fish3.bottomBumper = 350;

		fish2.fishR = "fish2R.png";
		fish2.fishL = "fish2L.png";
			fish2.FISH_BOX_SIZE = 210;
			fish2.rightBumper = 850;
			fish2.bottomBumper = 500;
			
		fish1.fishR = "fishR.png";
		fish1.fishL = "fishL.png";
	}
	
	public FishTank() {
        setPreferredSize(new Dimension(TANK_SIZE_WIDTH, TANK_SIZE_HEIGHT)); // of this, the JComponent

        //tankPic = Toolkit.getDefaultToolkit().getImage(url); //Stores the .png in tankPic
        URL tankPicURL = getClass().getResource("tank_bg.jpg");
        tankPic = Toolkit.getDefaultToolkit().getImage(tankPicURL); //Stores the .png in tankPic
        
        URL coralRURL = getClass().getResource("coralR.png");
        coralR = Toolkit.getDefaultToolkit().getImage(coralRURL); //Stores the .png in tankPic
        
        URL coralLURL = getClass().getResource("coralL.png");
        coralL = Toolkit.getDefaultToolkit().getImage(coralLURL);
        
        URL coralMURL = getClass().getResource("coralM.png");
        coralM = Toolkit.getDefaultToolkit().getImage(coralMURL);
    }
	
	public void paintComponent(Graphics graphics) {
		graphics.drawImage(tankPic, 0, 0, TANK_SIZE_WIDTH, TANK_SIZE_HEIGHT, null);
			fish3.draw(graphics);
		//	fish4.draw(graphics);
		graphics.drawImage(coralM, 0, 0, TANK_SIZE_WIDTH, TANK_SIZE_HEIGHT, null);
			fish1.draw(graphics);
		graphics.drawImage(coralL, 0, 0, TANK_SIZE_WIDTH, TANK_SIZE_HEIGHT, null);
			fish2.draw(graphics);
		graphics.drawImage(coralR, 0, 0, TANK_SIZE_WIDTH, TANK_SIZE_HEIGHT, null);
	}
	
	public void run() {
		nameFish();
		repaint();
		while (true){
			repaint();
				//START AUTO ADDED2
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//END AUTO ADDED
		}
		
	}

}
