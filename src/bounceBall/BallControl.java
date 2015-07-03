package bounceBall;

import java.awt.Color;

public class BallControl {

	private BallBox ballBox;
	private Balls balls;	
	private Ball ball;
	private BallDrawPanel ballDrawPanel;
	private BallWindow ballWindow;
	
	public BallControl(){
		ballBox = new BallBox(100, 100, 300, 200);
		balls = new Balls(ballBox);
		balls.createBalls();
//		ball = new Ball(200,200,1,1,10,Color.RED);
		this.ball = balls.getBall(0);
		ballDrawPanel = new BallDrawPanel(ballBox, ball);
		ballWindow = new BallWindow(500,500,ballDrawPanel);		
	}

	public void ballControl(){
		while(true){
			direction();
			movement();
			ballDrawPanel.redraw(ball);
			ballWindow.writeLabel(ball);
			try {
				Thread.sleep(10);
			} catch (InterruptedException ignore) {	}
		}
	}
	
	private void movement() {
		// TODO Auto-generated method stub
		ball.setBallPositionX(ball.getBallPositionX()+ball.getBallDirectionX());
		ball.setBallPositionY(ball.getBallPositionY()+ball.getBallDirectionY());		
	}

	private void direction() {
		// TODO Auto-generated method stub
		if(ball.getBallPositionX()>ballBox.getBoxX()+ballBox.getBoxWidth()-ball.getBallRadius()*2){
			ball.setBallDirectionX(-1);
		}
		if(ball.getBallPositionX()<ballBox.getBoxX()){
			ball.setBallDirectionX(1);
		}
		if(ball.getBallPositionY()>ballBox.getBoxY()+ballBox.getBoxHeight()-ball.getBallRadius()*2){
			ball.setBallDirectionY(-1);
		}
		if(ball.getBallPositionY()<ballBox.getBoxY()){
			ball.setBallDirectionY(1);
		}
	}
	
	public static void main(String[] args) {
		BallControl ballControl;
		ballControl = new BallControl();
		ballControl.ballControl();
	}
}
