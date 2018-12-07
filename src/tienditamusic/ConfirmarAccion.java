package tienditamusic;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ConfirmarAccion {
    static boolean respuesta;
    
    public static boolean mostrarPopUp(String title, String message) {
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label label = new Label(message);
        
        Button confirmar = new Button("Si");
        Button negar = new Button("No");
        
        confirmar.setOnAction(e -> {
            respuesta = true;
            window.close();
        });
        
        negar.setOnAction(e -> {
            respuesta = false;
            window.close();
        });
        
        VBox layout = new VBox(15);
        layout.getChildren().addAll(label, confirmar, negar);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return respuesta;
    }
}
