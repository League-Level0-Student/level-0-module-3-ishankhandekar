
package _02_loop_variables._3_robot_walk_of_fame;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		int x = 10;
		rob.setX(x);
		
		rob.penDown();
		for (int i = 0; i < 10; i++) {
		for (int n = 0; n < 5; n++) {
		
			rob.setSpeed(100000);
			rob.move(30);
			rob.turn(144);
		}
		x = x + 80;
	   rob.setX(x);
	   
	   
		}
		rob.setPenWidth(5);
		rob.setY(310);
		rob.turn(-90);
		rob.setPenColor(Color.red);
		rob.move(800);
		System.out.println(rob.getY());
		rob.setY(250);
		rob.turn(180);
		rob.move(800);
		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
