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
	
	public BallWindow(int width,int height,JPanel panel){
		label = new JLabel("");
		frame = new JFrame("");
		this.panel = panel;
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
	
	public void writeLabel(Ball ball){
		this.ball=ball;
		label.setText("X:"+ball.getBallPositionX()+"Y:"+ball.getBallPositionY());			
	}
}
