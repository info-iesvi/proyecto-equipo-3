package GamerHUB.Shared.view;

import GamerHUB.GestionEventos.controller.EventoAddController;
import GamerHUB.GestionEventos.controller.EventoController;
import GamerHUB.MainApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaAddEventVista {

    private Stage stageppal;

    public VentanaAddEventVista(Stage stageppal) {
        this.stageppal = stageppal;
    }

    /**
     * @throws IOException
     */
    public void LaunchaddEvent() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/Shared/view/VistaAddEventoDialog.fxml"));
        AnchorPane addEvento = (AnchorPane) loader.load();

        Scene scene = new Scene(addEvento, 400, 450);
        Stage dialogStage = new Stage();
        dialogStage.setScene(scene);
        dialogStage.setTitle("Nuevo evento");
        dialogStage.initModality(Modality.APPLICATION_MODAL);

        EventoAddController eventoaddController = loader.getController();
        eventoaddController.setVista(this,dialogStage);

        dialogStage.show();

    }

}
