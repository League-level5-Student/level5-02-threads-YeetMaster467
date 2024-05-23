package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	static // Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.

	Robot robArr[] = new Robot[5];

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			robArr[i] = new Robot();
			robArr[i].setY(490);
			robArr[i].setX((i * 100) + 100);

		}

		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			Robot rob = robArr[i];
			int threadID = i;
			Thread t = new Thread(() -> {
				while (rob.getY() < 10) {
					int num = r.nextInt(50);
					rob.move(num);
					if (rob.getY() < 10) {
						//JOptionPane.showMessageDialog(null, "Congratulations! Robot #" + threadID + 1 + " has won!!");
						rob.sparkle();
						// not sure how to wrap up
					}
				}
			});
			t.start();
		}

	}

}
