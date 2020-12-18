package p4_group_8_repo;

import javafx.scene.image.Image;

public class BackgroundImage extends Actor{
	Image background; 

	public void act(long now) {
		
		
	}
	
	/**
	 * calls background image
	 * @param imageLink
	 */
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 600, 800, true, true));

	}

}
