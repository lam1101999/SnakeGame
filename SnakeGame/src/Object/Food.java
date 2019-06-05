package Object;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import MainGame.Window;

public class Food {
	private Random rd;
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Food() {
		rd = new Random();
		x = rd.nextInt(Window.numberOfBox_X);
		y = rd.nextInt(Window.numberOfBox_Y);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x*Window.size+x*Window.distance, y*Window.size+y*Window.distance+10, Window.size, Window.size);
	}
}
