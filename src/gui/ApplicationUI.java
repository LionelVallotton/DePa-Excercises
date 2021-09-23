package gui;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {
    private PresentationModel pm;
    private TopArea topArea;
    //private CenterArea centerArea;
    //private BottomArea bottomArea;

    public ApplicationUI(){
        this.pm = new PresentationModel();
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        //bottomArea = new BottomArea(pm);
        //centerArea = new CenterArea(pm);
        topArea = new TopArea(pm);
    }
    private void layoutControls() {
        this.setPadding(new Insets(20));
        //this.setBottom(bottomArea);
        //this.setCenter(centerArea);
        this.setTop(topArea);
    }
}
