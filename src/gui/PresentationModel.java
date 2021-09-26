package gui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PresentationModel {
    private SimpleIntegerProperty red;
    private SimpleIntegerProperty green;
    private SimpleIntegerProperty blue;


    public PresentationModel() {
        this.red = new SimpleIntegerProperty();
        this.green = new SimpleIntegerProperty();
        this.blue = new SimpleIntegerProperty();

    }

    public void setRed(int red) {
        this.red.set(red);
    }

    public void setGreen(int green) {
        this.green.set(green);
    }

    public void setBlue(int blue) {
        this.blue.set(blue);
    }

    public Integer getRed() {
        return red.get();
    }

    public IntegerProperty redProperty() {
        System.out.println(red.toString());
        return red;
    }

    public int getGreen() {
        return green.get();
    }

    public SimpleIntegerProperty greenProperty() {
        return green;
    }

    public int getBlue() {
        return blue.get();
    }

    public SimpleIntegerProperty blueProperty() {
        return blue;
    }
}
