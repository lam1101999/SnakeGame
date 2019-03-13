package MainGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	Window window;
	
	
	public Main(int width,int height) {
		window = new Window(width,height);
		this.setSize(width,height);
		this.setBackground(Color.gray);
		this.add(window);
		this.addKeyListener(new MoveSnake(window.getSnake()));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
public static void main(String[] args) {
	new Main(800,550);
}
}
