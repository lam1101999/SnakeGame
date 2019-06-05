package Object;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import MainGame.Window;

public class Snake {
	
	
	private ArrayList<Block> chain;
	private Block head;
	private Random rd = new Random();	
	private int status;
	private long time;
	
	
	public ArrayList<Block> getChain() {
		return chain;
	}

	public void setChain(ArrayList<Block> snake) {
		this.chain = chain;
	}

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
		chain = new ArrayList<Block>();
		head = new Block(5,6);
		Block head1 = new Block(5,7);
		Block head2 = new Block(5,8);
		
		chain.add(head);
		chain.add(head1);
		chain.add(head2);
		status = goUp;
		
		time = System.currentTimeMillis();
		
		
	}
	
	public void tick() {
		if (System.currentTimeMillis() - time >= 200) {
		time = System.currentTimeMillis();
		for(int i = (chain.size() - 1); i > 0; i--) {
			chain.get(i).setX(chain.get(i-1).getX());
			chain.get(i).setY(chain.get(i-1).getY());
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

	}
	
	public void render(Graphics g) {
		for(Block block : chain)
			block.render(g);
		
	}
	
	
}
