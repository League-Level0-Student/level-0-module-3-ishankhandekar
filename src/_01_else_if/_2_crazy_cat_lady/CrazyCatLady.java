
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		String howManyCats = null;
		int howManyCats2 = -1;
		// 1. Ask the user how many cats they have
		howManyCats = JOptionPane.showInputDialog("How many cats do you have?");
		howManyCats2 = Integer.parseInt(howManyCats);
		if (howManyCats2 >= 3) {
			JOptionPane.showMessageDialog(null, "you are a crazy cat lady");
		} else if (howManyCats2 > 0 && howManyCats2 < 3) {
			JOptionPane.showMessageDialog(null, "you have a good number of cats");
		}else if (howManyCats2 == 0){
			JOptionPane.showMessageDialog(null, "YOU HAVE TO GET SOME CATS");
		}		// 2. Convert their answer into an integer
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

