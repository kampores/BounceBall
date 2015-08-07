package bounceBall;

import java.awt.Color;

public class Ball{

	private int ballPositionX;
	private int ballPositionY;	
	private int ballDirectionX;
	private int ballDirectionY;
	private int ballRadius;
	private int ballNumber;
	public enum BallState {RUN,STOP};
	private BallState ballState;
	private Color ballColor;
	
	
	

	public Ball(int ballPositionX, int ballPositionY, int ballDirectionX, int ballDirectionY, int ballRadius, Color ballColor, int ballNumber, BallState ballState){
		this.ballPositionX=ballPositionX;
		this.ballPositionY=ballPositionY;
		this.ballDirectionX=ballDirectionX;
		this.ballDirectionY=ballDirectionY;
		this.ballRadius=ballRadius;
		this.ballColor=ballColor;
		this.ballNumber=ballNumber;
		this.ballState=ballState;
	}
	
	public BallState getBallState() {
		return ballState;
	}

	public void setBallState(BallState ballState) {
		this.ballState = ballState;
	}

	public int getBallNumber() {
		return ballNumber;
	}

	public Ball getBall() {
		return this;
	}

	public Color getBallColor() {
		return ballColor;
	}

	public void setBallColor(Color ballColor) {
		this.ballColor = ballColor;
	}

	public int getBallRadius() {
		return ballRadius;
	}

	public void setBallRadius(int ballRadius) {
		this.ballRadius = ballRadius;
	}

	public int getBallPositionX() {
		return ballPositionX;
	}

	public void setBallPositionX(int ballPositionX) {
		this.ballPositionX = ballPositionX;
	}

	public int getBallPositionY() {
		return ballPositionY;
	}

	public void setBallPositionY(int ballPositionY) {
		this.ballPositionY = ballPositionY;
	}

	public int getBallDirectionX() {
		return ballDirectionX;
	}

	public void setBallDirectionX(int ballDirectionX) {
		this.ballDirectionX = ballDirectionX;
	}

	public int getBallDirectionY() {
		return ballDirectionY;
	}

	public void setBallDirectionY(int ballDirectionY) {
		this.ballDirectionY = ballDirectionY;
	}
}
