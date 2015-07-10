package bounceBall;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Balls {
	
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	private BallBox ballBox;
	
	static final int BALL_RADIUS = 10;

	public Balls(BallBox ballBox) {
		super();
		this.ballBox = ballBox;
	}

	public void createBalls(){
		Random random = new Random();
		Ball ball = new Ball(ballBox.getBoxX()+random.nextInt(ballBox.getBoxWidth()-BALL_RADIUS*2),
							 ballBox.getBoxY()+random.nextInt(ballBox.getBoxHeight()-BALL_RADIUS*2),
							 random.nextInt(1)*2-1,
							 random.nextInt(1)*2-1,
							 BALL_RADIUS,
							 Color.RED);
		balls.add(ball);
	}

	public Balls getBalls() {
		return this;
	}	
	
	public ArrayList<Ball> getListBalls() {
		return this.balls;
	}
	
	public Ball getBall(int index) {
		return balls.get(index);
	}
	
}
