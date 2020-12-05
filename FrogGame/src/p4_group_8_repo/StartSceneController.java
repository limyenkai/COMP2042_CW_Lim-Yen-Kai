package p4_group_8_repo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Textfield;
import javafx.scene.Scene;

public class StartSceneController {

	private GameController gameController;
	
	public void setGameController(GameController gameController) {
		this.gameController = gameController;
	}
	
    @FXML
    private TextField Textbox;

    @FXML
    private Button StartBtn;

    @FXML
    private void Start() {
    	gameController.start();
    }

    @FXML
    private void Text(InputMethodEvent event) {
   
    }
   }
