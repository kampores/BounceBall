package bounceBall;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BounceBallDrawPanel extends JPanel{

/**
	 * 
	 */
	private static final long serialVersionUID = 5997527719602278658L;
	//	private BallBox ballBox;
	private BallManager balls;
	
/*	public BallDrawPanel(BallBox ballBox, Balls balls){
		this.ballBox = ballBox;
		this.balls = balls;
		setBackground(Color.WHITE);
	}
*/
	public BounceBallDrawPanel(BallManager balls){
//		this.ballBox = ballBox;
		this.balls = balls;
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics graphics){
		graphics.setColor(Color.WHITE);
//		graphics.fillRect(ballBox.getBoxX(), ballBox.getBoxY(), ballBox.getBoxWidth(), ballBox.getBoxHeight());
		graphics.fillRect(BallControl.BALLBOX_XPOS, BallControl.BALLBOX_YPOS, BallControl.BALLBOX_WIDTH, BallControl.BALLBOX_HEIGHT);		
		for(Ball ball : balls.getListBalls()){
			graphics.setColor(ball.getBallColor());
			graphics.fillOval(ball.getBallPositionX(), ball.getBallPositionY(), 2*ball.getBallRadius(), 2*ball.getBallRadius());
			graphics.setColor(Color.WHITE);
			graphics.drawString(String.valueOf(ball.getBallNumber()), ball.getBallPositionX()+ball.getBallRadius()/2, ball.getBallPositionY()+ball.getBallRadius()*3/2);
		}
	}
}
