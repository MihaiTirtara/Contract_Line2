package Tier1;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CompanyController implements Initializable {

    @FXML
    private Button btnAddParti;

    @FXML
    private TableColumn<?, ?> columnParti;

    @FXML
    private Button btnSearch;

    @FXML
    private TableColumn<?, ?> columnId;

    @FXML
    private Button btnSearchPartiId;

    @FXML
    private TableView<?> tblPartici;

    @FXML
    private Button btnBank2;

    @FXML
    private Button btnBank3;

    @FXML
    private TextField txtNameComp;

    @FXML
    private Button btnBank1;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField txtPartici;

    @FXML
    private TextField txtBankRegNmbr;

    @FXML
    private TextField txtParticiId;

    @FXML
    private TextField txtIdCeo;

    @FXML
    private TextField txtCeo;

    @FXML
    private Circle crcleMsg;

    @FXML
    void txtNameComp(ActionEvent event) {

    }

    @FXML
    void txtIdCeo(ActionEvent event) {

    }

    @FXML
    void txtCeo(ActionEvent event) {

    }

    @FXML
    void btnSearch(ActionEvent event) {

    }

    @FXML
    void btnAdd(ActionEvent event) {

    }

    @FXML
    void crcleMsg(ActionEvent event) {

    }

    @FXML
    void txtParticiId(ActionEvent event) {

    }

    @FXML
    void txtPartici(ActionEvent event) {

    }

    @FXML
    void btnAddParti(ActionEvent event) {

    }

    @FXML
    void btnSearchPartiId(ActionEvent event) {

    }

    @FXML
    void txtBankRegNmbr(ActionEvent event) {

    }

    @FXML
    void btnBank1(ActionEvent event) {

    }

    @FXML
    void btnBank2(ActionEvent event) {

    }

    @FXML
    void btnBank3(ActionEvent event) {
       
          Parent root;
          try
          {
             // instatiate invoke the fxml loader
             FXMLLoader loader = new FXMLLoader();

             // set controller
             loader.setController(new CompanyController());

             // set the location of the FXML doc
             loader.setLocation(getClass().getResource("Bank.fxml"));
             root = loader.load();

             // Build the scene graph

             Scene scene = new Scene(root);

             Stage stage = new Stage();

             // show the window using the scene graph
            
             stage.setScene(scene);
             stage.show();
          }
          catch (IOException e)
          {
             e.printStackTrace();
          }
    }


   public void initialize(URL location, ResourceBundle resources)
   {
      // TODO Auto-generated method stub
      
   }

}
