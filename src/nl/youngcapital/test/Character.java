package nl.youngcapital.test;

import java.awt.Color;
import java.awt.Graphics;

public class Character extends GamePaneel{
	int xPos, yPos;
	Color color;
	
	public Character(int x, int y, Color color){
		this.xPos = x;
		this.yPos = y;
		this.color = color;
	}
	
	public void MoveHor(int direction){
		xPos += direction;
		System.out.println(xPos);
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillRect(xPos, yPos, 100, 100);
	}

}
