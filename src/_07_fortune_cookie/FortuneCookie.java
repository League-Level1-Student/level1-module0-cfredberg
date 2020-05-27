package _07_fortune_cookie;

import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	public void showButton() {
		System.out.println("Button Clicked!");
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		
		int rand = new Random().nextInt(5);
		
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You will suddenly get very wealthy.");
		}else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will learn to code in the near future.");
		}else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will fall today.");
		}else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will get a new computer today.");
		}else {
			JOptionPane.showMessageDialog(null, "I can't predict your future.");
		}
	}
}
