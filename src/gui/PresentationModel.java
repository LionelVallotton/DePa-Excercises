package gui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {
    private SimpleIntegerProperty red;
    private SimpleIntegerProperty green;
    private SimpleIntegerProperty blue;

    public PresentationModel() {
        this.red = new SimpleIntegerProperty();
        this.green = new SimpleIntegerProperty();
        this.blue = new SimpleIntegerProperty();
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
