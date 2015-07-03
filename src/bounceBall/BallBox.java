package bounceBall;

public class BallBox {

	private int boxX;
	private int boxY;
	private int boxWidth;
	private int boxHeight;
	
	public BallBox(int boxX, int boxY, int boxWidth, int boxHeight) {
		super();
		this.boxX = boxX;
		this.boxY = boxY;
		this.boxWidth = boxWidth;
		this.boxHeight = boxHeight;
	}

	public int getBoxX() {
		return boxX;
	}

	public int getBoxY() {
		return boxY;
	}

	public int getBoxWidth() {
		return boxWidth;
	}

	public int getBoxHeight() {
		return boxHeight;
	}	
	
}
