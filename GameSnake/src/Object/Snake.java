package Object;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import MainGame.Window;

public class Snake {
	
	
	private ArrayList<Block> snake;
	private Block head;
	private Random rd = new Random();	
	private int status;
	
	public Block getHead() {
		return head;
	}

	public void setHead(Block head) {
		this.head = head;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	static public int goUp = 1;
	static public int goDown = -1;
	static public int goRight = 2;
	static public int goLeft = -2;

	public Snake() {
		snake = new ArrayList<Block>();
		head = new Block(rd.nextInt(20),rd.nextInt(15));
		status = goUp;
	}
	
	public void tick() {
		if (status == goUp)
		head.setY(head.getY()-1);
		if (status == goDown)
		head.setY(head.getY()+1);
		if (status == goRight)
		head.setX(head.getX()+1);
		if (status == goLeft)
		head.setX(head.getX()-1);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(head.getX()*Window.size+head.getX()*Window.distance, head.getY()*Window.size+head.getY()*Window.distance+10, Window.size, Window.size);
	}
	
	
}
