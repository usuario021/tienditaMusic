package tienditamusic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application{
    
    Stage window;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        stage.setOnCloseRequest(e -> {
            e.consume();
            salir();
        });
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    private void salir(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "¿Está seguro que desea salir?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            window.close();
        }
    }
}
