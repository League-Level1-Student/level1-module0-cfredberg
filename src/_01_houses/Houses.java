package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robo = new Robot();
	
	public void run() {
		robo.moveTo(10, 500);
		robo.penDown();
		robo.setAngle(90);
		robo.setSpeed(50);
		robo.miniaturize();
		Random ran = new Random();
		for(int i = 0; i < 9; i++) {
			int num = ran.nextInt(3);
			if(num == 0) {
				house("small");
			}else if(num == 2) {
				house("medium");
			}else {
				house("");
			}
			grass();
		}
	}
	
	public static void house(String size) {
		if (size.equals("small")) {
			int co = new Random().nextInt(3);
			if (co == 0) {
				robo.setPenColor(Color.RED);
			}else if (co == 1) {
				robo.setPenColor(Color.BLUE);
			}else {
				robo.setPenColor(Color.ORANGE);
			}
			robo.turn(-90);
			robo.move(60);
			pointyRoof();
			robo.move(60);
			robo.turn(-90);
		}else if (size.contentEquals("medium")) {
			int lo = new Random().nextInt(3);
			if (lo == 0) {
				robo.setPenColor(Color.RED);
			}else if (lo == 1) {
				robo.setPenColor(Color.BLUE);
			}else {
				robo.setPenColor(Color.ORANGE);
			}
			robo.turn(-90);
			robo.move(120);
			pointyRoof();
			robo.move(120);
			robo.turn(-90);
		}else {
			int r = new Random().nextInt(3);
			if (r == 0) {
				robo.setPenColor(Color.RED);
			}else if (r == 1) {
				robo.setPenColor(Color.BLUE);
			}else {
				robo.setPenColor(Color.ORANGE);
			}
			robo.turn(-90);
			robo.move(250);
			flatRoof();
			robo.move(250);
			robo.turn(-90);
		}
	}
	
	public static void pointyRoof() {
		robo.turn(30);
		robo.move(20);
		robo.turn(120);
		robo.move(20);
		robo.turn(30);
	}
	
	public static void flatRoof() {
		robo.turn(90);
		robo.move(20);
		robo.turn(90);
	}
	
	public static void grass() {
		robo.setPenColor(Color.GREEN);
		robo.move(20);
	}
}
