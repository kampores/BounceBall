package bounceBall;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import bounceBall.Ball.BallState;

public class ControlButtonPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2160268032827604109L;
	private JButton ballCreateButton;
	private JComboBox ballSelectComboBox;
	private JButton ballStartStopButton;	
	private JButton ballDeleteButton;
	private DefaultComboBoxModel ballComboBoxModel;

	public ControlButtonPanel(final BallManager balls) {
		ballCreateButton = new JButton("Ball Create");
		ballSelectComboBox = new JComboBox();
		ballComboBoxModel = new DefaultComboBoxModel();
		ballStartStopButton = new JButton("Ball Start/Stop");
		ballDeleteButton = new JButton("Ball Delete");
		
		ballCreateButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ballComboBoxModel.addElement(String.valueOf(balls.createBall()));
			}
		});
		ballDeleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ballComboBoxModel.removeElement(String.valueOf(balls.deleteBall()));
			}
		});		
		ballSelectComboBox.setModel(ballComboBoxModel);
		ballStartStopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(Ball ball : balls.getListBalls()){
					if (ball.getBallNumber()==Integer.parseInt((String) ballSelectComboBox.getSelectedItem())){
						if (ball.getBallState()==BallState.RUN){
							ball.setBallState(BallState.STOP);
						}
						else if (ball.getBallState()==BallState.STOP){
							ball.setBallState(BallState.RUN);							
						}
						break;
					};
				}
			}
		});
				
		setLayout(new FlowLayout());
		add(ballCreateButton);
		add(ballDeleteButton);			
		add(ballSelectComboBox);
		add(ballStartStopButton);
	}
}
