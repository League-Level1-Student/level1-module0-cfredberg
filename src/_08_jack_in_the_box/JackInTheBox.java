package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

public class JackInTheBox implements ActionListener {
	int count = 0;
	
	public static void main(String[] args) {
		new JackInTheBox().start();
	}
	
	public void start() {
		JFrame frame1 = new JFrame();
		JButton button = new JButton();
		frame1.add(button);
		button.addActionListener(this);
		frame1.add(button);
		frame1.setVisible(true);
		frame1.pack();
	}
	
	private void showPicture(String fileName) { 
	      try {
	           JLabel imageLabel = createLabelImage(fileName);
	           JFrame frame = new JFrame();
	           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	           frame.add(imageLabel);
	           frame.setVisible(true);
	           frame.pack();
	           playSound("homer-woohoo.wav");
	      } catch (Exception e) {
	           e.printStackTrace();
	      }
	 }



	private JLabel createLabelImage(String fileName) {
	     try {
		          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	           } else {
	                Icon icon = new ImageIcon(imageURL);
	                JLabel imageLabel = new JLabel(icon);
	                return imageLabel;
	          }
	      } catch (Exception e) {
	           System.err.println("Could not find image " + fileName);
	           return new JLabel();
	     }
	 }

	private void playSound(String soundFile) { 
	      try {
	           AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	           sound.play();
	      } catch (Exception e) {
	           e.printStackTrace();
	      }
	 }


	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		
		if(count == 5) {
			showPicture("jackInTheBox.png");
		}
	}

}
