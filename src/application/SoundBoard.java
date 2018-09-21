package application;


import java.io.File;
import java.util.Scanner;

import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;

public class SoundBoard {
	SoundEntity[] soundList;
	int soundAmount;
	
	public SoundBoard() {
		Scanner in = new Scanner(System.in);
		soundList = new SoundEntity[10];
		in.close();
	}
	
	public void importSound() {
		
	}

}
