package bounceBall;


import bounceBall.Ball.BallState;



public class BallControl {

	public static final int BALLBOX_XPOS = 100;
	public static final int BALLBOX_YPOS = 100;
	public static final int BALLBOX_WIDTH = 300;
	public static final int BALLBOX_HEIGHT = 200;	
	
//	private BallBox ballBox;
	private BallManager balls;	
	private BounceBallWindow ballWindow;

	final int TIMER_INTERVAL = 10;
	
//	final int BOUNCING_BALLS = 3;
	
	public BallControl(){
//		ballBox = new BallBox();
//		balls = new Balls(ballBox);
		balls = new BallManager();		
		ballWindow = new BounceBallWindow(balls);		
//		timer = new Timer(TIMER_INTERVAL, new TimerAction());
		ballControl();
	}

	public void ballControl(){
		while(true){
			for(Ball ball : balls.getListBalls()){
				if(ball.getBallState()==BallState.RUN){
					ballDirectionControl(ball);
					ballMove(ball);
				}
			}
			ballWindow.redraw();
//			ballWindow.writeLabel(balls,0,bounceBallOnOff);
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
//		if(ball.getBallPositionX()>ballBox.getBoxX()+ballBox.getBoxWidth()-ball.getBallRadius()*2){
		if(ball.getBallPositionX()>BALLBOX_XPOS+BALLBOX_WIDTH-ball.getBallRadius()*2){			
			ball.setBallDirectionX(-1);
		}
//		if(ball.getBallPositionX()<ballBox.getBoxX()){
		if(ball.getBallPositionX()<BALLBOX_XPOS){
			ball.setBallDirectionX(1);
		}
//		if(ball.getBallPositionY()>ballBox.getBoxY()+ballBox.getBoxHeight()-ball.getBallRadius()*2){
		if(ball.getBallPositionY()>BALLBOX_YPOS+BALLBOX_HEIGHT-ball.getBallRadius()*2){
			ball.setBallDirectionY(-1);
		}
//		if(ball.getBallPositionY()<ballBox.getBoxY()){
		if(ball.getBallPositionY()<BALLBOX_YPOS){			
			ball.setBallDirectionY(1);
		}
	}
	
/*	public void setAnimation(boolean turnOnOff) {
		if (turnOnOff) {
			timer.start();
		}
		else {
			timer.stop();
		}	
	}
	
	class TimerAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for(Ball ball : balls.getListBalls()){
				ballDirectionControl(ball);
				ballMove(ball);
			}
			ballWindow.redraw();
//			ballWindow.writeLabel(balls,0,bounceBallOnOff);
		}
	}
	
	class StartStopAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (bounceBallOnOff) {
				bounceBallOnOff = false;
			}
			else {
				bounceBallOnOff = true;
			}
			setAnimation(bounceBallOnOff);
		}
	}
*/	
	public static void main(String[] args) {
		new BallControl();
	}
}
