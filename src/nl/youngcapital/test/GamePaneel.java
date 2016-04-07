package nl.youngcapital.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePaneel extends JPanel implements KeyListener{
	
	Character held;
	
	public GamePaneel(){
		setLayout(null);
		addKeyListener(this);
		setFocusable(true);
		requestFocus();
		setBackground(Color.BLACK);
		held = new Character(100,100, Color.BLUE);
		add(held);
	}
	
	public void paintComponent(Graphics g)
	{
		repaint();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch( keyCode )
		{
			case KeyEvent.VK_RIGHT : held.MoveHor(+1);
			break;
			case KeyEvent.VK_LEFT : held.MoveHor(-1);
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {
		System.out.println("key typed");
	}

	
}
