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
//		head = new Block(rd.nextInt(20),rd.nextInt(15));
		head = new Block(5,6);
		Block head1 = new Block(5,7);
		Block head2 = new Block(5,8);
		
		snake.add(head);
		snake.add(head1);
		snake.add(head2);
		status = goUp;
	}
	
	public void tick() {
		
		for(int i = (snake.size() - 1); i > 0; i--) {
			snake.get(i).setX(snake.get(i-1).getX());
			snake.get(i).setY(snake.get(i-1).getY());
		}
		
		
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
		for(Block block : snake)
			block.render(g);
		
	}
	
	
}
