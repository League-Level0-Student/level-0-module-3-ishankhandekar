package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {

	public static void main(String[] args) {

		String answer1 = "";
		String answer2 = "";

		while (!answer1.equalsIgnoreCase("yes") || !answer1.equalsIgnoreCase("no")) {
			answer1 = JOptionPane.showInputDialog("Are you happy?");

			if (answer1.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing!");
				System.exit(1);
			} else if (answer1.equalsIgnoreCase("no")) {
				answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
			} else {

				JOptionPane.showMessageDialog(null, "You cannot enter anything other than yes or no \n TRY AGAIN!",
						"ERROR", JOptionPane.ERROR_MESSAGE);
				answer1 = "";
			}
		}

		if (answer2.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		} else if (answer2.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing!");
		}
	}
}
