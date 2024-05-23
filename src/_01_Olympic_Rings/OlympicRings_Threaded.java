package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
	public static void main(String[] args) {
		Robot rob = new Robot(300, 300);
		Robot pob = new Robot(400, 300);
		Robot yob = new Robot(500, 300);
		Robot hob = new Robot(350, 350);
		Robot dob = new Robot(450, 350);
		rob.penDown();
		pob.penDown();
		yob.penDown();
		hob.penDown();
		dob.penDown();
		rob.hide();
		pob.hide();
		yob.hide();
		hob.hide();
		dob.hide();
		rob.setPenWidth(5);
		pob.setPenWidth(5);
		yob.setPenWidth(5);
		hob.setPenWidth(5);
		dob.setPenWidth(5);
		rob.setPenColor(Color.BLUE);
		pob.setPenColor(Color.BLACK);
		yob.setPenColor(Color.RED);
		hob.setPenColor(Color.YELLOW);
		dob.setPenColor(Color.GREEN);
		
		Thread robT = new Thread(() -> {
			for (int i = 0; i < 375; i++) {
				rob.turn(1);
				rob.move(1);
			}
		});
		Thread pobT = new Thread(() -> {
			for (int i = 0; i < 375; i++) {
				pob.turn(1);
				pob.move(1);
			}
		});
		Thread yobT = new Thread(() -> {
			for (int i = 0; i < 375; i++) {
				yob.turn(1);
				yob.move(1);
			}
		});
		Thread hobT = new Thread(() -> {
			for (int i = 0; i < 375; i++) {
				hob.turn(1);
				hob.move(1);
			}
		});
		Thread dobT = new Thread(() -> {
			for (int i = 0; i < 375; i++) {
				dob.turn(1);
				dob.move(1);
			}
		});
		
		robT.start();
		pobT.start();
		yobT.start();
		hobT.start();
		dobT.start();
		
	}
}

