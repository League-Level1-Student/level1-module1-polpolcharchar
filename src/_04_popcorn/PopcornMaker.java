package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {

		Popcorn pop = new Popcorn(JOptionPane.showInputDialog("What flavor do you want?"));
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		micro.setTime(Integer.parseInt(JOptionPane.showInputDialog("How long do you want it to cook?")));
		micro.startMicrowave();
		
	}
}
