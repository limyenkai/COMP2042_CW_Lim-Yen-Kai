package p4_group_8_repo;

import java.io.File;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	    background = new MyStage();
	    Scene scene  = new Scene(background, 600, 690);
	   
		//Obstacle obstacle = new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 25, 25, 3);
		//Obstacle obstacle1 = new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 100, 100,2 );
		//Obstacle obstacle2 = new Obstacle("file:src/p4_group_8_repo/truck1Right.png",0,  150, 1);
	    
		BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/iKogsKW.png");
	    
		background.add(froggerback);
		
		background.add(new Log("file:src/p4_group_8_repo/shortlog.png", 150, 0, 140, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/shortlog.png", 150, 220, 140, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/shortlog.png", 150, 440, 140, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/longlog.png", 300, 0, 250, 2));
		background.add(new Log("file:src/p4_group_8_repo/longlog.png", 300, 400, 250, 2));
		
		background.add(new Turtle(500, 295, -1, 130, 130));
		background.add(new Turtle(300, 295, -1, 130, 130));
		background.add(new WetTurtle(700, 295, -1, 130, 130));
		background.add(new WetTurtle(600, 191, -1, 130, 130));
		background.add(new WetTurtle(400, 191, -1, 130, 130));
		background.add(new WetTurtle(200, 191, -1, 130, 130));
		
		background.add(new End(11,75));
		background.add(new End(137,75));
		background.add(new End(267,75));
		background.add(new End(394,75));
		background.add(new End(520,75));
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 100, 555, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 340, 555, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 500, 555, 1, 120, 120));
		//background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 720, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 100, 508, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 250, 508, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 400, 508, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 550, 508, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 0, 455, 2, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 300, 455, 2, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 1000, 455, 2, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 500, 405, -5, 50, 50));
		background.add(new Digit(0, 30, 550, 20));
		//background.add(obstacle);
		//background.add(obstacle1);
		//background.add(obstacle2);
		background.start();
		primaryStage.setScene(scene);
		primaryStage.show();
		start();  
	}
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };
    }
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }

    public void stop() {
        timer.stop();
    }
    
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.add(new Digit(k, 30, 550 - shift, 20));
    		  shift+=30;
    		}
    }
}
