package p4_group_8_repo;

import javafx.scene.image.Image;

public class Log extends Actor {

	private double speed;
	
	/**
	 * set the movement speed of log
	 * @param now
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}
	
	/**
	 * Sets the image of logs
	 * @param imageLink
	 * @param size
	 * @param xpos
	 * @param ypos
	 * @param s
	 */
	public Log(String imageLink, int size, int xpos, int ypos, double s) {
		setImage(new Image(imageLink, size,size, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}
	
	/**
	 * The speed of the log
	 * @return the speed of the log
	 */
	public boolean getLeft() {
		return speed < 0;
	}
}
