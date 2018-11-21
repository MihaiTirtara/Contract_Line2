



import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainController{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnLogIn"
    private Button btnLogIn; // Value injected by FXMLLoader

    @FXML // fx:id="btnReg"
    private Button btnReg; // Value injected by FXMLLoader

    @FXML
    void btnLogIn(ActionEvent event) {

    }

    @FXML
    void btnReg(ActionEvent event) {

    }
//    @FXML
//    void deleteEvent(ActionEvent event)
//    {
//       Parent root;
//       try
//       {
//          // instatiate invoke the fxml loader
//          FXMLLoader loader = new FXMLLoader();
//
//          // set controller
//          loader.setController(new DeleteEventController());
//
//          // set the location of the FXML doc
//          loader.setLocation(getClass().getResource("DeleteEvent.fxml"));
//          root = loader.load();
//
//          // Build the scene graph
//
//          Scene scene = new Scene(root);
//
//          Stage stage = new Stage();
//
//          // show the window using the scene graph
//          stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
//          stage.setTitle("Delete Event");
//          stage.setScene(scene);
//          stage.show();
//       }
//       catch (IOException e)
//       {
//          e.printStackTrace();
//       }
//
//    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnLogIn != null : "fx:id=\"btnLogIn\" was not injected: check your FXML file 'Untitled'.";
        assert btnReg != null : "fx:id=\"btnReg\" was not injected: check your FXML file 'Untitled'.";

    }
}
