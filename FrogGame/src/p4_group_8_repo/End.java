package p4_group_8_repo;

import javafx.scene.image.Image;

public class End extends Actor{
	boolean activated = false;
	@Override
	public void act(long now) {
	}
	
	/**
	 * Image of the end goal
	 * @param x	x axis position of the end goal
	 * @param y	y axis position of the end goal
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/p4_group_8_repo/img/End.png", 60, 60, true, true)); //Frog end goal image
	}
	
	/**
	 * Image of a frog in the end goal
	 */
	public void setEnd() {
		setImage(new Image("file:src/p4_group_8_repo/img/FrogEnd.png", 70, 70, true, true)); //Frog reached goal image
		activated = true;
	}
	
	/**
	 * Returns true if the frog has reached the end goal
	 * @return returns true if the frog has reached the end goal
	 */
	public boolean isActivated() {
		return activated;
	}
	

}
