package tienditamusic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        boolean respuesta = ConfirmarAccion.mostrarPopUp("¿Desea salir?", "Está seguro que desea salir?");
        if(respuesta)
            window.close();
    }
}
