package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private AnchorPane pane;
	private Label label;
	
	@Override
	public void start(Stage stage) { //Этот метод из класса апликэйшен запускается при методе Launch(args)
		
		this.stage = stage;
		try {
			
			//(Анкорпейн) костование так как пейн в данном случае анкорпейн (полиморфизм), а все остальное это чтоб загрузить файл Helloworld.
			
			pane= (AnchorPane) FXMLLoader.load(Main.class.getResource("HelloWorld1.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		scene = new Scene(pane, 700, 300);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);   //Этот метод наследуются от Апликейшен, который наследует класс мэйн, нужен  первую очередь для того чтобы при работе с фх этот метод обеспечивает внутренние процессы фх нужные нами и сам запуск фх
	}
}