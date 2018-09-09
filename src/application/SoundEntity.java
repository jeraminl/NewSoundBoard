package application;



import java.io.*;

import javafx.scene.media.*;


public class SoundEntity {
	Media clip;
	private String soundName;
	
	public SoundEntity(String name) {
		soundName = name;
		clip = new Media(new File(soundName).toURI().toString());
	}

}
