package bounceBall;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BallWindow{
	
	private JLabel label;
	private Ball ball;
	private JFrame frame;
	private JPanel panel;
	private Dimension frameSize,screenSize;

	public BallWindow(int width,int height,BallBox ballBox,Balls balls){
		this.panel = new BallDrawPanel(ballBox,balls);		
		drawWindow(width,height);
	}	
	
	private void drawWindow(int width,int height){
		label = new JLabel("");
		frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frameSize = frame.getSize();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((screenSize.width-frameSize.width)/2,(screenSize.height-frameSize.height)/2);
		frame.setTitle("Bounce Ball");
		frame.add(label,BorderLayout.NORTH);		
		frame.add(panel,BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	public void writeLabel(Balls balls,int index){
		this.ball=balls.getBall(index);
		label.setText("X:"+ball.getBallPositionX()+"Y:"+ball.getBallPositionY());			
	}
	
	public void redraw(){
		panel.repaint();
	}	
	
/*	public static void main(String[] args) {
		Runnable doBouncingBall = new Runnable() {
			public void run() {
				BallWindow ballWindow = new BallWindow(500,500);		
			}
		};
		SwingUtilities.invokeLater(doBouncingBall);
	}*/
}
