package MainGame;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Object.Snake;

public class Window extends JPanel implements Runnable{
	private Snake snake;
	public static int size = 30;
	public static int distance = 1;
	private long time1;
	Thread thread;
	int a;
	
	public Window () {

	}
	
	// GETTER AND SETTER
	public Snake getSnake() {
		return snake;
	}


	public void setSnake(Snake snake) {
		this.snake = snake;
	}
	////////////////////////////////////
	
	
    // CONSTRUCTOR
	public Window ( int width, int height) {
		
		this.setSize(width*80/100, height);
		this.setBackground(Color.red);
		
		a = 0;
		snake = new Snake();
		time1 = System.currentTimeMillis();
		
		
		thread = new Thread(this);
		thread.start();
	
		this.setVisible(true);
	}
	/////////////////////////////////////
	// TICK AND RUN
	public void tick() {
		tickSnake();
	}
	
	public void paint(Graphics g) {
		drawBoard(20,15,size,distance,g);
		snake.render(g);
	}
	
	public void run() {
		while(true) {
			if ((System.currentTimeMillis() - time1) >= 1000) {
				time1 = System.currentTimeMillis();
				tick();
				repaint();
			}
		}
	}
	//////////////////////////////////////////
	
	//SOME FUNCTION FOR TICK AND RUN
	public void drawBoard(int numberOfBox_X, int numberOfBox_Y, int size, int distance, Graphics g) {
		g.setColor(Color.green);
		for (int i = 0; i < numberOfBox_X; i++)
			for(int j = 0; j < numberOfBox_Y; j++)
			g.fillRect(i*distance+i*size, j*distance +j*size+10, size, size);
	}
	
	public void tickSnake() {
			snake.tick();
	}
	///////////////////////////////////////////////
	
}
