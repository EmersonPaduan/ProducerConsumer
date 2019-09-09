package telas;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * TelaController
 */
public class TelaController {

    @FXML
    private TextField txtProducer;

    @FXML
    private TextField txtConsumer;

    @FXML
    private TextArea txtContainer;

    @FXML
    private AnchorPane painel;


    public AnchorPane getPainel(){
        return painel;
    }
    
    public synchronized void setTextProducer(String txt){
        txtProducer.setText(txt);
    }

    public synchronized void setTextProducer(String txt, String corFonte, String corFundo){
        Platform.runLater(() -> {
            txtProducer.setStyle("-fx-background-color: "+ corFundo +"; -fx-text-fill: "+corFonte);
            txtProducer.setText(txt);
        });
    }

    public synchronized String getTextProducer(){
        return txtProducer.getText();
    }

    public synchronized void setTextConsumer(String txt){
        txtConsumer.setText(txt);
    }

    public synchronized void setTextConsumer(String txt, String corFonte, String corFundo){
        //
        Platform.runLater(() -> {
            txtConsumer.setStyle("-fx-background-color: "+ corFundo +"; -fx-text-fill: "+corFonte);
            txtConsumer.setText(txt);
        });
    }

    public synchronized String getTextConsumer(){
        return txtConsumer.getText();
    }

    public synchronized void setTextContainer(String txt){
        Platform.runLater(() -> {
            txtContainer.setText(txt);
        });
    }

    public synchronized String getTextContainer(){
        return txtContainer.getText();
    } 

}