package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.MediaPlayer;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Button button = new Button("play");
			Scene buttonScene = new Scene(button, 200, 100);
			
			button.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent actionEvent) {
					SoundEntity test = new SoundEntity("src/gunshot.wav");
					MediaPlayer mediaPlayer = new MediaPlayer(test.clip);
					
					mediaPlayer.play();
				}
			});
			
			
			primaryStage.setScene(scene);
			primaryStage.setScene(buttonScene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		launch(args);

	}
}
