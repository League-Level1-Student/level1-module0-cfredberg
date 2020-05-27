package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("saw");
	JButton button1 = new JButton("dog");
	
	public static void main(String[] args) {
		new sound().code();
	}
	
	public void code() {
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(button1);
		frame.pack();
	}
	
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			playSound("saw.wav");
		}else {
			playSound("dog.wav");
		}
	}
}
