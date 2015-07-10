package bounceBall;

public class BallControl {

	private BallBox ballBox;
	private Balls balls;	
	private BallWindow ballWindow;
	
	final int BALLWINDOW_LENGTH = 500;
	final int BALLWINDOW_HEIGHT = 500;	
	
	final int BOUNCING_BALLS = 3;
	
	public BallControl(){
		ballBox = new BallBox();
		balls = new Balls(ballBox);
		for(int i=0;i<BOUNCING_BALLS;i++){
			balls.createBalls();
		}
		ballWindow = new BallWindow(BALLWINDOW_LENGTH,BALLWINDOW_HEIGHT,ballBox,balls);
	}

	public void ballControl(){
		while(true){
			for(Ball ball : balls.getListBalls()){
				ballDirectionControl(ball);
				ballMove(ball);
			}
			ballWindow.redraw();
			ballWindow.writeLabel(balls,0);
			try {
				Thread.sleep(10);
			} catch (InterruptedException ignore) {	}
		}
	}
	
	private void ballMove(Ball ball) {
		// TODO Auto-generated method stub
		ball.setBallPositionX(ball.getBallPositionX()+ball.getBallDirectionX());
		ball.setBallPositionY(ball.getBallPositionY()+ball.getBallDirectionY());		
	}

	private void ballDirectionControl(Ball ball) {
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
