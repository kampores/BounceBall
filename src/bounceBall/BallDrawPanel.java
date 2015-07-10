package bounceBall;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BallDrawPanel extends JPanel{

	private BallBox ballBox;
	private Balls balls;
	
	public BallDrawPanel(BallBox ballBox, Balls balls){
		this.ballBox = ballBox;
		this.balls = balls;
		setBackground(Color.WHITE);	
	}

	public void paintComponent(Graphics graphics){
		graphics.setColor(Color.WHITE);
		graphics.fillRect(ballBox.getBoxX(), ballBox.getBoxY(), ballBox.getBoxWidth(), ballBox.getBoxHeight());
		for(Ball ball : balls.getListBalls()){
			graphics.setColor(ball.getBallColor());
			graphics.fillOval(ball.getBallPositionX(), ball.getBallPositionY(), 2*ball.getBallRadius(), 2*ball.getBallRadius());
		}
	}

}
