
package helloword;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblIdioma;
    private Button btnIdioma;
    private Label lblHora;
    private Button btnHora;
    
        @FXML
        private void SetIdioma(ActionEvent event) {
            lblIdioma.setText("Hello World!");
        }
        private void SetHora(ActionEvent event) {
            lblHora.setText("Hello World!");
        }

        @Override
        public void initialize(URL url, ResourceBundle rb) {
        }    

}
