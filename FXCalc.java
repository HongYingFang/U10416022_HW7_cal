import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.util.*;

public class FXCalc extends Application {
	

	@Override
	public void start(Stage primaryStage) throws Exception {

		// set window size
		int HEIGHT = 300;
		int WIDTH = 400;

		// DataFields
		// new buttons
		String strMButtons[] = { "MC", "MR", "MS", "M+", "M-" };
		Button MButtons[] = new Button[5];
		Button symbol1;
		Button CE;
		Button C;
		Button symbol2;
		Button symbol3;
		Button seven;
		Button eight;
		Button nine;
		Button symbol4;
		Button symbol5;
		Button four;
		Button five;
		Button six;
		Button symbol6;
		Button symbol7;
		Button one;
		Button two;
		Button three;
		Button symbol8;
		Button symbol9;
		Button zero;
		Button point;
		Button symbol10;
		TextField writingField;

		// set buttons' size
		symbol1 = new Button("←");
		symbol1.setPrefSize(50, 50);
		CE = new Button("CE");
		CE.setPrefSize(50, 50);
		C = new Button("C");
		C.setPrefSize(50, 50);
		symbol2 = new Button("+/-");
		symbol2.setPrefSize(50, 50);
		symbol3 = new Button("√");
		symbol3.setPrefSize(50, 50);

		seven = new Button("7");
		seven.setPrefSize(50, 50);
		eight = new Button("8");
		eight.setPrefSize(50, 50);
		nine = new Button("9");
		nine.setPrefSize(50, 50);
		symbol4 = new Button("/");
		symbol4.setPrefSize(50, 50);
		symbol5 = new Button("%");
		symbol5.setPrefSize(50, 50);

		four = new Button("4");
		four.setPrefSize(50, 50);
		five = new Button("5");
		five.setPrefSize(50, 50);
		six = new Button("6");
		six.setPrefSize(50, 50);
		symbol6 = new Button("*");
		symbol6.setPrefSize(50, 50);
		symbol7 = new Button("1/X");
		symbol7.setPrefSize(50, 50);

		one = new Button("1");
		one.setPrefSize(50, 50);
		two = new Button("2");
		two.setPrefSize(50, 50);
		three = new Button("3");
		three.setPrefSize(50, 50);
		symbol8 = new Button("-");
		symbol8.setPrefSize(50, 50);
		symbol9 = new Button("=");
		symbol9.setPrefSize(50, 100);
		zero = new Button("0");
		zero.setPrefSize(100, 50);
		point = new Button(".");
		point.setPrefSize(50, 50);
		symbol10 = new Button("+");
		symbol10.setPrefSize(50, 50);

		// use for loop to set buttons' size(MButtons) and place it in sequence
		int funcCounter1 = MButtons.length;
		for (int i = 0; i < funcCounter1; i++) {
			MButtons[i] = new Button(strMButtons[i]);
			MButtons[i].setPrefSize(51.5, 51.5);
		}

		// set title
		primaryStage.setTitle("U10416022 Calculator");

		// new textfield and set size
		writingField = new TextField();
		writingField.setPrefWidth(260);

		// new meuubar
		MenuBar menubar = new MenuBar();

		Menu menu1 = new Menu("檢視(V)");
		MenuItem item1 = new MenuItem("function1");
		MenuItem item2 = new MenuItem("function2");
		menu1.getItems().addAll(item1, item2);

		Menu menu2 = new Menu("編輯(E)");
		MenuItem item3 = new MenuItem("function3");
		MenuItem item4 = new MenuItem("function4");
		menu2.getItems().addAll(item3, item4);

		Menu menu3 = new Menu("說明(H)");
		MenuItem item5 = new MenuItem("function5");
		MenuItem item6 = new MenuItem("function6");
		menu3.getItems().addAll(item5, item6);
		menubar.getMenus().addAll(menu1, menu2, menu3);

		// new allPane,menuPane,MPane,mainPane by FlowPane and GridPane
		FlowPane allPane = new FlowPane();
		FlowPane menuPane = new FlowPane();
		GridPane mainPane = new GridPane();
		FlowPane MPane = new FlowPane(Orientation.HORIZONTAL);
		menuPane.getChildren().addAll(menubar);
		MPane.getChildren().addAll(MButtons);
		allPane.getChildren().addAll(menubar, writingField, MPane, mainPane);
		// set padding for border
		allPane.setPadding(new Insets(0, 20, 20, 20));
		// set buttons and place buttons in the mainPane
		mainPane.setVgap(2);
		mainPane.setHgap(2);

		mainPane.add(symbol1, 0, 0);
		mainPane.add(CE, 1, 0);
		mainPane.add(C, 2, 0);
		mainPane.add(symbol2, 3, 0);
		mainPane.add(symbol3, 4, 0);

		mainPane.add(seven, 0, 1);
		mainPane.add(eight, 1, 1);
		mainPane.add(nine, 2, 1);
		mainPane.add(symbol4, 3, 1);
		mainPane.add(symbol5, 4, 1);

		mainPane.add(four, 0, 2);
		mainPane.add(five, 1, 2);
		mainPane.add(six, 2, 2);
		mainPane.add(symbol6, 3, 2);
		mainPane.add(symbol7, 4, 2);

		mainPane.add(one, 0, 3);
		mainPane.add(two, 1, 3);
		mainPane.add(three, 2, 3);
		mainPane.add(symbol8, 3, 3);
		mainPane.add(symbol9, 4, 3, 1, 2);

		mainPane.add(zero, 0, 4, 2, 1);
		mainPane.add(point, 2, 4);
		mainPane.add(symbol10, 3, 4);

		// new Scene
		Scene scene = new Scene(allPane, HEIGHT, WIDTH);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// add action >>set the action after the user presses
		// 0
		zero.setOnAction(e -> {
			writingField.setText(writingField.getText() + "0");
		});
		// 1
		one.setOnAction(e -> {
			writingField.setText(writingField.getText() + "1");
		});
		// 2
		two.setOnAction(e -> {
			writingField.setText(writingField.getText() + "2");
		});
		// 3
		three.setOnAction(e -> {
			writingField.setText(writingField.getText() + "3");
		});
		// 4
		four.setOnAction(e -> {
			writingField.setText(writingField.getText() + "4");
		});
		// 5
		five.setOnAction(e -> {
			writingField.setText(writingField.getText() + "5");
		});
		// 6
		six.setOnAction(e -> {
			writingField.setText(writingField.getText() + "6");
		});
		// 7
		seven.setOnAction(e -> {
			writingField.setText(writingField.getText() + "7");
		});
		// 8
		eight.setOnAction(e -> {
			writingField.setText(writingField.getText() + "8");
		});
		// 9
		nine.setOnAction(e -> {
			writingField.setText(writingField.getText() + "9");
		});
		// .
		point.setOnAction(e -> {
			writingField.setText(writingField.getText() + ".");
		});
		
		


	}

}
