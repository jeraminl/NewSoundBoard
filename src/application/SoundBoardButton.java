package application;

import javafx.scene.control.Button;

public class SoundBoardButton extends Button {
	static int btnCount = 0;
	int btnID;
	
	public SoundBoardButton () {
		super("play");
		btnID = btnCount;
		btnCount++;
		System.out.print("btnID created: " + btnID);
	}
	
	
}
