/*
 * Noah Alonso-Torres
 * Nemo and Friend Fish Tank
 * Command Class
 */

import java.awt.*;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

//public class Command extends JApplet {
public class Command {
	private FishTank drawer;

    public void setUpFrame() {

    		drawer = new FishTank();
        JFrame frame = new JFrame("Nemo Tank");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(new JLabel(""), BorderLayout.SOUTH);
        frame.getContentPane().add(drawer, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // fit the JFrame around its contents
        frame.setVisible(true);
    }

    
	public static void main(String[] args){
		Command command = new Command();
		command.setUpFrame();
        command.drawer.run();
	}
}
