package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.setPreferredSize(new Dimension(600, 500));
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// Copy Image Address)
		String link = "https://zdnet2.cbsistatic.com/hub/i/2020/03/09/6630eddc-683e-4ec2-ae4d-5cdb6c341a68/apple1.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(link);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What brand of computer is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equalsIgnoreCase("apple")) {
			JOptionPane.showMessageDialog(null, "Correct! This is the apple 1");
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect! The brand is apple and the computer is the apple 1");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component image1 = createImage("https://images.macworld.com/images/news/graphics/138368-macintoshportable_original.jpg");
		// 11. add the second image to the quiz window
		quizWindow.add(image1);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question1 = JOptionPane.showInputDialog("Is this a laptop or desktop?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (question1.equalsIgnoreCase("laptop")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect! It is a laptop");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
