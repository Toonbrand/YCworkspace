package nl.youngcapital.test;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FrameDemo");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new GamePaneel());
		JFrame.setDefaultLookAndFeelDecorated(true);
		
	}

}
