package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class BottomArea extends HBox {
    PresentationModel pm;
    Rectangle rectangle;
    Paint color;
    Button darker;
    Button brighter;
    VBox buttons;
    RadioButton rbred;
    RadioButton rbcyan;
    RadioButton rbgreen;
    ToggleGroup toggleGroup;
    VBox rbuttons;

    public BottomArea(PresentationModel pm) {
        this.pm = pm;
        initializeControls();
        initializeLayout();
    }

    private void initializeLayout() {
        System.out.println("hallo");
        buttons = new VBox(darker, brighter);
        buttons.setPadding(new Insets(20));
        buttons.setSpacing(20);
        rbuttons = new VBox(rbred, rbgreen, rbcyan);
        rbuttons.setPadding((new Insets(20)));
        rbuttons.setSpacing(20);

        this.getChildren().addAll(rectangle, rbuttons, buttons);
    }

    private void initializeControls() {
        rectangle = new Rectangle(140,140);
        pm.redProperty().addListener((observable, oldValue, newValue)-> updateColor());
        pm.greenProperty().addListener((observable, oldValue, newValue)-> updateColor());
        pm.blueProperty().addListener((observable, oldValue, newValue)-> updateColor());

        darker = new Button("Darker");
        brighter = new Button("Brighter");

        darker.setOnAction(event -> setDarker());
        brighter.setOnAction(event -> setBrighter());

        rbred = new RadioButton("red");
        rbcyan = new RadioButton("cyan");
        rbgreen = new RadioButton("green");

        toggleGroup = new ToggleGroup();

        rbred.setToggleGroup(toggleGroup);
        rbgreen.setToggleGroup(toggleGroup);
        rbcyan.setToggleGroup(toggleGroup);


        rbred.setOnAction(event -> {
            pm.setBlue(0);
            pm.setGreen(0);
            pm.setRed(255);
        });
        rbcyan.setOnAction(event -> {
            pm.setBlue(255);
            pm.setGreen(0);
            pm.setRed(0);
        });
        rbgreen.setOnAction(event -> {
            pm.setBlue(0);
            pm.setGreen(255);
            pm.setRed(0);
        });


    }

    private void setDarker() {
        pm.setRed(pm.getRed()+10);
        pm.setGreen(pm.getGreen()+10);
        pm.setBlue((pm.getBlue()+10));
    }
    private void setBrighter() {
        pm.setRed(pm.getRed()-10);
        pm.setGreen(pm.getGreen()-10);
        pm.setBlue((pm.getBlue()-10));
    }

    private void updateColor(){
        color = new Color(1.0/255*pm.getRed(), 1.0/255*pm.getGreen(), 1.0/255*pm.getBlue(),  0.5);
        this.getChildren().removeAll(buttons, rbuttons, rectangle);
        rectangle.setFill(color);
        this.getChildren().addAll(rectangle,rbuttons, buttons);
    }
}
