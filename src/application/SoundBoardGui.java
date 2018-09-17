package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaPlayer;


public class SoundBoardGui extends Application {
	@Override
	public void start(Stage primaryStage) {
		//SoundBoard sb = new SoundBoard();
		try {
			//BorderPane root = new BorderPane();


			
			GridPane gp = new GridPane();
			
			Button button = new Button("play");
			
			gp.add(button, 0, 0,1,1);
			//Scene buttonScene = new Scene(button, 200, 100);
			
			button.setOnMouseClicked(new EventHandler<MouseEvent>() {
				public void handle(MouseEvent event) {
					MouseButton click = event.getButton();
					SoundEntity test = new SoundEntity("src/gunshot.wav");
					MediaPlayer mediaPlayer = new MediaPlayer(test.clip);
					
					mediaPlayer.play();
				}
			});
			
			
			Scene scene = new Scene(gp,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			//primaryStage.setScene(buttonScene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
 
		launch(args);

	}
}
