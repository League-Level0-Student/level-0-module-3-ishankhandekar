package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Choose_your_own_adventure {
public static void main(String[] args) {
	String answer2;
	String answer1  = JOptionPane.showInputDialog("It is Cristmas and you are trying to find out if Santa is real."
			+ " What do you do: Go to the fire place and wait, Go outside and see if you can see him. Type 1 if you think the first one, type 2 if you think its the second one");
	if ( answer1 == "1") {
		 answer1 = JOptionPane.showInputDialog("you hear a thumping noise on your chimney. What do you do, quickly hide behind your chair, show yourself to santa");
	}else {
		  answer2 = JOptionPane.showInputDialog(" you see santa's sleigh and it's heading straight for the roof. "
				+ "what do you do. jump onto the sleigh and try to drive it, or try to make santa notice you and turn around");
		if (answer2 == "1") {
			JOptionPane.showMessageDialog(null, "the sleigh drove streight into the wall and you broke both of your feet");
		}else {
			JOptionPane.showMessageDialog(null, "Congratulations you typed all the right answers!");
		} if (answer1 == "1") {
			JOptionPane.showMessageDialog(null, "Congratulations, you typed in all the right answers!");
		}else {
			JOptionPane.showMessageDialog(null, "Santa saw you and thought you were his enemy, the grinch, so he blasted you ten feet away leaving you dazed");
		}
	}
}}
