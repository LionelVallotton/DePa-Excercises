package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {
    private PresentationModel pm;
    private TopArea topArea;
    private BottomArea bottomArea;
    private Menu file;
    private Menu help;
    private MenuBar menuBar;

    public ApplicationUI(){
        this.pm = new PresentationModel();
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        bottomArea = new BottomArea(pm);
        topArea = new TopArea(pm);
        createMenuBar();

    }
    private void layoutControls() {
        this.setTop(menuBar);
        this.setPadding(new Insets(20));

        this.setBottom(bottomArea);
        //this.setCenter(centerArea);
        this.setCenter(topArea);



    }

    private void createMenuBar() {
        file = new Menu("File");
        help = new Menu("help");
        menuBar = new MenuBar();
        menuBar.getMenus().addAll(file, help);
    }
}
