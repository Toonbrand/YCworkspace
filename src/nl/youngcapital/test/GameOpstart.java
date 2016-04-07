package nl.youngcapital.test;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class GameOpstart extends JFrame{

	GamePaneel gamePaneel;
	
	public static void main(String[] args) {
		new GameOpstart();
		
	}
	
	public GameOpstart(){
		setSize(500, 500);
		setTitle("Platformgame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamePaneel = new GamePaneel();
		
		add(gamePaneel, BorderLayout.CENTER);
		
		
		setVisible(true);
	}
}
