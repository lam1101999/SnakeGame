package MainGame;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel{
	
	public Window () {
		
	}
	
	
	public Window ( int width, int height, String title) {
		
		this.setSize(width, height);
		this.setBackground(Color.black);
		this.setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		drawBoard(10,10,10,1,g);
	}
	
	public void drawBoard(int numberOfBox_X, int numberOfBox_Y, int size, int distance, Graphics g) {
		g.setColor(Color.white);
		for (int i = 0; i < numberOfBox_X; i++)
			for(int j = 0; j < numberOfBox_Y; j++)
			g.drawRect(i*distance+i*size, j*distance +j*size, size, size);
	}
}
