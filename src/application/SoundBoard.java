package application;

import javafx.scene.media.MediaPlayer;

public class SoundBoard {
	public static void main(String[] args) throws Exception{
		SoundEntity test = new SoundEntity("src/gunshot.wav");
		MediaPlayer mediaPlayer = new MediaPlayer(test.clip);
		
		mediaPlayer.play();
		
	}
}
