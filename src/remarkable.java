import javax.swing.JOptionPane;

public class remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		if (name.equalsIgnoreCase("brian")) {
			JOptionPane.showConfirmDialog(null, "Brian you have blue eyes right?");
			
		} else if (name.equalsIgnoreCase("izzy")) {
			JOptionPane.showConfirmDialog(null, "Izzy you have brown eyes right?"); 
		} else if (name.equalsIgnoreCase("elijah")) {
			JOptionPane.showConfirmDialog(null, "Elijah you have brown eyes right?");
		}else if (name.equalsIgnoreCase("kamron")) {
			JOptionPane.showConfirmDialog(null, "Kamron you have brown eyes right?");
		}else if (name.equalsIgnoreCase("jackie")) {
			JOptionPane.showConfirmDialog(null, "Jackie you have blue eyes right?");
		}else if (name.equalsIgnoreCase("ian")) {
			JOptionPane.showConfirmDialog(null, "Ian you have brown and blue eyes right?");
		}
	}
}
