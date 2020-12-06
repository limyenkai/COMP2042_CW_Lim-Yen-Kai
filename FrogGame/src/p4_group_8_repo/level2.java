package p4_group_8_repo;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class level2 extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	MouseEvent event;
	
	public void init() throws Exception{
		/*StartSceneController start = new StartSceneController();
		start.Start(event);*/
	    	/*FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("StartScene.fxml"));
	    	Parent root1 = (Parent) fxmlloader.load();
	    	Stage stage = new Stage();
	    	
	    	stage.setTitle("Frog Game");
	    	stage.setScene(new Scene(root1));
	    	stage.show();*/
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Frog Game");
	    background = new MyStage();
	    Scene scene  = new Scene(background, 600, 690);

		BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/iKogsKW.png");
	    
		background.add(froggerback);
		
		background.add(new Log("file:src/p4_group_8_repo/shortlog.png", 150, 0, 140, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/shortlog.png", 150, 220, 140, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/shortlog.png", 150, 440, 140, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/longlog.png", 300, 0, 250, 2));
		background.add(new Log("file:src/p4_group_8_repo/longlog.png", 300, 400, 250, 2));
		
		background.add(new Turtle(500, 295, -1, 130, 130));  	//first lane turtle
		background.add(new Turtle(300, 295, -1, 130, 130));  	//first lane turtle
		background.add(new WetTurtle(700, 295, -1, 130, 130));	//first lane turtle
		
		background.add(new WetTurtle(600, 191, -1, 130, 130)); 	//third lane turtle
		background.add(new WetTurtle(400, 191, -1, 130, 130));	//third lane turtle
		background.add(new WetTurtle(200, 191, -1, 130, 130));	//third lane turtle
		
		background.add(new End(11,75));
		background.add(new End(137,75));
		background.add(new End(267,75));
		background.add(new End(394,75));
		background.add(new End(520,75));
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Left.png", 100, 555, -2, 120, 120)); //first lane
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Left.png", 340, 555, -2, 120, 120)); //first lane
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Left.png", 500, 555, -2, 120, 120)); //first lane

		background.add(new Obstacle("file:src/p4_group_8_repo/car1Right.png", 100, 508, 1, 50, 50)); //second lane
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Right.png", 250, 508, 1, 50, 50)); //second lane
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Right.png", 400, 508, 1, 50, 50)); //second lane
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Right.png", 550, 508, 1, 50, 50)); //second lane
		
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Left.png", 0, 455, -2, 120, 120)); //third lane
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Left.png", 300, 455, -2, 120, 120)); //third lane
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1Left.png", 1000, 455, -2, 120, 120)); //third lane
		
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Right.png", 500, 405, 5, 50, 50)); //forth lane
		
		background.add(new Digit(0, 30, 550, 20));
		background.start();
		primaryStage.setScene(scene);
		primaryStage.show();
		start();  
	};  
	
	public void stop() throws Exception {
		System.out.println("stop");
	}
	
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
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




