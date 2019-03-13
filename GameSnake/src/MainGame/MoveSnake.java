package MainGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Object.Snake;

public class MoveSnake implements KeyListener {

	Snake snake;
	public MoveSnake(Snake snake) {
		this.snake = snake;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if((e.getKeyCode() == KeyEvent.VK_UP) && ((snake.getStatus() + Snake.goUp) != 0))
			snake.setStatus(Snake.goUp);
		if((e.getKeyCode() == KeyEvent.VK_DOWN) && ((snake.getStatus() + Snake.goDown) != 0))
			snake.setStatus(Snake.goDown);
		if((e.getKeyCode() == KeyEvent.VK_RIGHT) && ((snake.getStatus() + Snake.goRight) != 0))
			snake.setStatus(Snake.goRight);
		if((e.getKeyCode() == KeyEvent.VK_LEFT) && ((snake.getStatus() + Snake.goLeft) != 0))
			snake.setStatus(Snake.goLeft);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
