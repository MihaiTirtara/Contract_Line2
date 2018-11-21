

import javafx.application.Application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      // instatiate invoke the fxml loader
      FXMLLoader loader = new FXMLLoader();

      // set controller
      loader.setController(new MainController());

      // set the location of the FXML doc
      loader.setLocation(getClass().getResource("Mainwindow.fxml"));
      Parent root = loader.load();

      // Build the scene graph

      Scene scene = new Scene(root);

      // show the window using the scene graph

      primaryStage.setTitle("VIA Main");
      primaryStage.setScene(scene);
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }

}
