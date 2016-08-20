package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private FlowPane pane;
	private Label label;
	
	@Override
	public void start(Stage stage) { //Этот метод из класса апликэйшен запускается при методе Launch(args)
		
		this.stage = stage;
		pane= new FlowPane();
		label = new Label("Hello epta");
		pane.getChildren().add(label);  //метод getChildren, как вариант помещения на панель коммпонентов.
		scene = new Scene(pane, 300, 400);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);   //Этот метод наследуются от Апликейшен, который наследует класс мэйн, нужен  первую очередь для того чтобы при работе с фх этот метод обеспечивает внутренние процессы фх нужные нам
	}
}
