package Object;

import java.awt.Color;
import java.awt.Graphics;

import MainGame.Window;

public class Block {
	
	
	private int x;
	private int y;
	public Block (int x, int y) {
		this.x = x;
		this.y = y;
	}
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
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x*Window.size+x*Window.distance, y*Window.size+y*Window.distance+10, Window.size, Window.size);
	}
	
}
