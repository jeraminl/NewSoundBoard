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
		System.out.print("How Many Sounds are you using?");
		soundAmount = in.nextInt();
		
		
		in.close();
	}

}
