package bounceBall;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BallDrawPanel extends JPanel{

	private BallBox ballBox;
	private Ball ball;
	
	public BallDrawPanel(BallBox ballBox, Ball ball){
		this.ballBox = ballBox;
		this.ball = ball;
		setBackground(Color.WHITE);		
	}

	public void paintComponent(Graphics graphics){
		graphics.setColor(Color.WHITE);
		graphics.fillRect(ballBox.getBoxX(), ballBox.getBoxY(), ballBox.getBoxWidth(), ballBox.getBoxHeight());
		graphics.setColor(ball.getBallColor());
		graphics.fillOval(ball.getBallPositionX(), ball.getBallPositionY(), 2*ball.getBallRadius(), 2*ball.getBallRadius());
	}

	public void redraw(Ball ball){
		this.ball=ball;
		repaint();
	}	
}
