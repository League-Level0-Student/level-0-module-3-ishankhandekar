
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(5);
		for (int i = 0; i < args.length; i++) {
			
		String guess = JOptionPane.showInputDialog("guess what the random number from 1 to 5 is");
					int guess2 = Integer.parseInt(guess);
			if (guess2 == random) {
				JOptionPane.showMessageDialog(null, "You win");
				
			}else if (guess2 > random) {
				JOptionPane.showMessageDialog(null, "your guess is too high");
			}else if (guess2 < random) {
				JOptionPane.showMessageDialog(null, "your guess is too low");
			}}
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high5
			
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


