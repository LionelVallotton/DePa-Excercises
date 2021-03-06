package gui;

import javafx.beans.property.Property;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class TopArea extends HBox {
    private PresentationModel pm;
    private TilePane tilePane;
    private Slider sliderR;
    private Slider sliderG;
    private Slider sliderB;
    private TextField decimalR;
    private TextField decimalG;
    private TextField decimalB;
    private Paint color;
    private Rectangle rectangle;
    private VBox sliderBox;
    private VBox textBox;


    public TopArea(PresentationModel pm) {
        this.pm = pm;
        initializeControls();
        initializeLayout();

    }

    private void initializeLayout() {
        //setPadding(new Insets(10));
        sliderBox = new VBox(sliderR, sliderG, sliderB);
        sliderBox.setSpacing(10);
        textBox = new VBox(decimalR, decimalG, decimalB);
        //sliderBox.setMargin(sliderR, new Insets(20,20,20,20));
        this.getChildren().addAll(sliderBox, textBox);
    }

    private void initializeControls() {
        sliderR = new Slider(0,255, 100);
        sliderG = new Slider(0,255, 100);
        sliderB = new Slider(0,255, 100);
        decimalR = new TextField();
        decimalG = new TextField();
        decimalB = new TextField();

        //color = new Color(55, 55, 55, 0);
        rectangle = new Rectangle(120, 120);
        sliderR.valueProperty().bindBidirectional(pm.redProperty());
        decimalR.textProperty().bindBidirectional(pm.redProperty(), new NumberStringConverter());
        sliderG.valueProperty().bindBidirectional(pm.greenProperty());
        decimalG.textProperty().bindBidirectional(pm.greenProperty(), new NumberStringConverter());
        sliderB.valueProperty().bindBidirectional(pm.blueProperty());
        decimalB.textProperty().bindBidirectional(pm.blueProperty(), new NumberStringConverter());


    }



}
