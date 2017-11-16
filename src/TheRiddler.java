import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/so
		String riddle = JOptionPane.showInputDialog(null, "Who makes it, has no need of it.\n"
				+ "Who buys it, has no use for it. \n" + "Who uses it can neither see nor feel it. \n" + "What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle.equalsIgnoreCase("coffin")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else
			JOptionPane.showMessageDialog(null, "wrong");
		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog(null, "Imagine you are in a dark room. How do you get out?");
		if (riddle2.equalsIgnoreCase("Stop imagining")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else
			JOptionPane.showMessageDialog(null, "wrong");
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "this is your score " + score);
	}
}
