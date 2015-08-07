package bounceBall;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BounceBallWindow{
	
	private JLabel label;
	private Ball ball;
	private JFrame frame;

	private JPanel buttonPanel;	
	private JPanel ballDrawPanel;
	private Dimension frameSize,screenSize;

	private static final int BALLWINDOW_WIDTH = 500;
	private static final int BALLWINDOW_HEIGHT = 500;	

	public BounceBallWindow(BallManager balls){
		balls.setBallWindow(this);
		this.ballDrawPanel = new BounceBallDrawPanel(balls);		
		this.buttonPanel = new ControlButtonPanel(balls);
		drawWindow(BALLWINDOW_WIDTH,BALLWINDOW_HEIGHT);		
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
//		frame.add(label,BorderLayout.NORTH);
		frame.add(buttonPanel,BorderLayout.NORTH);
		frame.add(ballDrawPanel,BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	public void writeLabel(BallManager balls,int index,boolean bounceBallOnOff){
		this.ball=balls.getBall(index);
		if (bounceBallOnOff){
			label.setText("ON X:"+ball.getBallPositionX()+"Y:"+ball.getBallPositionY());			
		}
		else {
			label.setText("OFF X:"+ball.getBallPositionX()+"Y:"+ball.getBallPositionY());
		}
	}
	
	public void redraw(){
		ballDrawPanel.repaint();
	}	

	public void cantDeleteBallPopupMessage(){
		JOptionPane.showMessageDialog(frame, "더 지울 공이 없습니다.");		
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
