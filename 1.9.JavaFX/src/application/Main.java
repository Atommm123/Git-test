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
	public void start(Stage stage) { //���� ����� �� ������ ���������� ����������� ��� ������ Launch(args)
		
		this.stage = stage;
		pane= new FlowPane();
		label = new Label("Hello epta");
		pane.getChildren().add(label);  //����� getChildren, ��� ������� ��������� �� ������ ������������.
		scene = new Scene(pane, 300, 400);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);   //���� ����� ����������� �� ����������, ������� ��������� ����� ����, �����  ������ ������� ��� ���� ����� ��� ������ � �� ���� ����� ������������ ���������� �������� �� ������ ���
	}
}
