package application;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import controller.RGBColorController;


public class App extends HBox {


	private static final long serialVersionUID = 1L;

	private RGBColorController controller; // Color controller
	private Rectangle sample; // Color preview box
	private TextField colorCode; // Text field containing the color in hex format

	/** Construct the application */
	public App() {
		controller = new RGBColorController(79, 178, 255);
		initUI();
	}

	public RGBColorController getController() {
		return controller;
	}
	
	private void initUI() {
		//TODO 0 : Read the content of ColorController.java, RGBColorController.java, ColorModel.java and ColorView.java to understand the structure of the project.
		
		// Column 1: Sliders
		
		VBox sliderPane = new VBox();
		sliderPane.setPadding(new Insets(20, 10, 10, 20));
		sliderPane.setSpacing(30);
		// TODO 1 : add sliders to sliderPane
		// TODO 2 : bind sliders to controller
		// Red
		// ...
		// Green
		// ...
		// Blue
		// ...

		// Column 2: Text fields (next to the sliders)
		VBox textPane = new VBox();		// Red
		textPane.setPadding(new Insets(10, 10, 10, 10));
		textPane.setSpacing(20);
		// TODO 3 : add textfields to textPane
		// TODO 4 : bind textfields to controller
		// Red
		// ...
		// Green
		// ...
		// Blue
		// ...

		// Column 3: Hex color field and color sample
		VBox hexPane = new VBox();
		hexPane.setAlignment(Pos.CENTER);
		hexPane.setPadding(new Insets(10, 10, 10, 10));
		hexPane.setSpacing(10); 
		// Color in hex format
		// TODO 5 : add colorfield  to hexPane 
		// TODO 6 : bind colorfield it to controller
		// ...
		// Color preview
		sample = new Rectangle (100,100);
		hexPane.getChildren().add(sample);
		controller.bind(sample);

		// Resize window and make it visible
		this.getChildren().addAll(sliderPane, textPane, hexPane);	}



}
