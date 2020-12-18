package p4_group_8_repo;

import javafx.scene.image.Image;

public class Obstacle extends Actor {
	private int speed;
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}
	
	/**
	 * this method sets the position of obstacles such as Cars and Trucks
	 * @param imageLink	location of the image file
	 * @param xpos 		x axis position of the truck or car
	 * @param ypos		y axis position of the truck or car
	 * @param s 		speed of the truck or car
	 * @param w			width of the truck or car
	 * @param h			height of the truck or car
	 */
	public Obstacle(String imageLink, int xpos, int ypos, int s, int w, int h) {
		setImage(new Image(imageLink, w,h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
	}

}
