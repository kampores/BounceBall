package bounceBall;

import java.awt.Color;

public class BallControl {

	private Ball b;
	private BallDraw d;

	public BallControl(){
		b = new Ball(200,200,1,1,10,Color.RED);
		d = new BallDraw();
	}

	public void ballControl(){
		while(true){
			direction();
			movement();
			d.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException ignore) {	}
		}
	}
	
	private void movement() {
		// TODO Auto-generated method stub
		b.setBallPositionX(b.getBallPositionX()+b.getBallDirectionX());
		b.setBallPositionY(b.getBallPositionY()+b.getBallDirectionY());		
	}

	private void direction() {
		// TODO Auto-generated method stub
		if(b.getBallPositionX()>390){
			b.setBallDirectionX(-1);
		}
		if(b.getBallPositionX()<100){
			b.setBallDirectionX(1);
		}
		if(b.getBallPositionY()>290){
			b.setBallDirectionY(-1);
		}
		if(b.getBallPositionY()<100){
			b.setBallDirectionY(1);
		}
	}
	public static void main(String[] args) {
		BallControl c;
		Window w;
		c = new BallControl();
		w = new Window(500,500);
		c.ballControl();
	}
}
