package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robo = new Robot();
	
	public void run() {
		robo.moveTo(10, 500);
		robo.penDown();
		robo.setAngle(90);
		house("small");
	}
	
	public static void house(String size) {
		if (size.equals("small")) {
			robo.turn(-90);
			robo.move(60);
			pointyRoof();
			robo.move(60);
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
}
