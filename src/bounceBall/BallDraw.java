package bounceBall;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BallDraw extends JFrame{

	private Ball b;
	
	public BallDraw(){
		
	}
	
	public void ballDraw(Graphics g){
		g.setColor(b.getBallColor());
		g.drawOval(b.getBallDirectionX(), b.getBallDirectionY(), 2*b.getBallRadius(), 2*b.getBallRadius());
	}
}
