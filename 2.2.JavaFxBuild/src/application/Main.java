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
	public void start(Stage stage) { //���� ����� �� ������ ���������� ����������� ��� ������ Launch(args)
		
		this.stage = stage;
		try {
			
			//(���������) ���������� ��� ��� ���� � ������ ������ ��������� (�����������), � ��� ��������� ��� ���� ��������� ���� Helloworld.
			
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
		launch(args);   //���� ����� ����������� �� ����������, ������� ��������� ����� ����, �����  ������ ������� ��� ���� ����� ��� ������ � �� ���� ����� ������������ ���������� �������� �� ������ ���� � ��� ������ ��
	}
}