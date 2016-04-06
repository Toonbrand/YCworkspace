package nl.youngcapital.test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePaneel extends JPanel{
	
	int windowSize = getWidth();

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int windowWidth = getWidth();
		int windowHeight = getHeight();
		
		g.setColor(Color.pink);
		g.fillRect(windowWidth/2,windowHeight/2, 50,50);
		
	}
}
