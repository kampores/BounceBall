package bounceBall;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;


public class Balls {
	
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	private BallBox ballBox;

	public Balls(BallBox ballBox) {
		super();
		this.ballBox = ballBox;
	}

	public void createBalls(){
		Random random = new Random();
		Ball ball = new Ball(ballBox.getBoxX()+random.nextInt(ballBox.getBoxWidth()),
							 ballBox.getBoxY()+random.nextInt(ballBox.getBoxHeight()),
							 random.nextInt(1)*2-1,
							 random.nextInt(1)*2-1,
							 10,
							 Color.RED);
		balls.add(ball);
	}

	public Ball getBall(int index) {
		return balls.get(index);
	}
	
}
