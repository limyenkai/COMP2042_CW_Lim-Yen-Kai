package p4_group_8_repo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HighScore {

private String highScore = "";

if(highScore.equals("")) {
	highScore = this.getHighScore()
}
	
public String getHighScore(){
	
	FileReader readFile = null;
	BufferedReader reader = null;
	
	try {
		readFile = new FileReader("highscore.dat");
		reader = new BufferedReader(readFile);
		return reader.readLine();
	}
	
	catch (Exception e){
		return "0";
	}
	finally {
		try {
			reader.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
