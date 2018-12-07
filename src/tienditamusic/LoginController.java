package tienditamusic;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author rojas
 */
public class LoginController implements Initializable {
    
    ListaUsuarios model;
    
    @FXML
    private TextField username;
    
    @FXML
    private PasswordField password;
    
    @FXML
    public void logear(ActionEvent event) throws IOException{
        String nombre = username.getText();
        String pass = password.getText();
        if(nombre.equals("admin")&&pass.equals("1234")){
            Parent parent = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
            Scene escenaMenu = new Scene(parent);
            Stage menuStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            menuStage.setScene(escenaMenu);
            menuStage.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING, "Credenciales incorrectas, por favor intente de nuevo", ButtonType.OK);
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
