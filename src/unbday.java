import javax.swing.JOptionPane;

public class unbday {
public static void main(String[] args) {
	String bday=JOptionPane.showInputDialog("what is your birthday");
if(bday.equals("11/01")) {
	JOptionPane.showMessageDialog(null,"happy birthday");}else {JOptionPane.showMessageDialog(null,"happy unbirthday");}
}
}
