/**
 * TODO: 30.12.2017
 * @deadline: 07.01.20!8*/

package calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    /**
     *
     */
    private AnchorPane pane;
    private Image icons;
    private Scene scene;

    public void init() throws Exception {
        pane = FXMLLoader.load(Main.class.getResource("GUI.fxml"));
        scene = new Scene(pane);

        scene.getStylesheets().add((getClass().getResource("style.css")).toExternalForm());

        icons = new Image(getClass().getResource("img/icon.png/").toExternalForm());
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.getIcons().add(icons);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {launch(args);}
}
