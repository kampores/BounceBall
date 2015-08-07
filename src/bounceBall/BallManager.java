package bounceBall;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;


import bounceBall.Ball.BallState;

public class BallManager {
	
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	private int ballNumber = 0;
	private BounceBallWindow ballWindow;
	
	final int BALL_RADIUS = 10;
	
/*	public Balls(BallBox ballBox) {
		this.ballBox = ballBox;
	}
*/	
	public BallManager() {
	}

	public int createBall(){
		Random random = new Random();
/*		Ball ball = new Ball(ballBox.getBoxX()+random.nextInt(ballBox.getBoxWidth()-BALL_RADIUS*2),
							 ballBox.getBoxY()+random.nextInt(ballBox.getBoxHeight()-BALL_RADIUS*2),
							 random.nextInt(1)*2-1,
							 random.nextInt(1)*2-1,
							 BALL_RADIUS,
							 Color.RED);
*/		Ball ball = new Ball(BallControl.BALLBOX_XPOS+random.nextInt(BallControl.BALLBOX_WIDTH-BALL_RADIUS*2),
						BallControl.BALLBOX_YPOS+random.nextInt(BallControl.BALLBOX_HEIGHT-BALL_RADIUS*2),
						random.nextInt(1)*2-1,
						random.nextInt(1)*2-1,
						BALL_RADIUS,
						Color.RED,
						++ballNumber,
						BallState.RUN);
		balls.add(ball);
		return ballNumber;
	}

	public void setBallWindow(BounceBallWindow ballWindow){
		this.ballWindow=ballWindow;
	}

	
	public int deleteBall(){
		if(!balls.isEmpty()){
			balls.remove(ballNumber-1);
			return ballNumber--;
		}
		else {
			ballWindow.cantDeleteBallPopupMessage();
			return 0;
		}
	}

	public BallManager getBalls() {
		return this;
	}	
	
	public ArrayList<Ball> getListBalls() {
		return this.balls;
	}
	
	public Ball getBall(int index) {
		return balls.get(index);
	}
	
}
