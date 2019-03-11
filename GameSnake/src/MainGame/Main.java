package MainGame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public Main(int width,int height) {
		this.setSize(width,height);
		this.add(new Window(width,height,"SnakeGame"));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new Main(600,700);
}
}
