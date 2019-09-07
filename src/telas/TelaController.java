package telas;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

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

    public synchronized void setTextProducer(String txt, Color cor){
        //txtProducer.setStyle("-fx-background-color: "+ corFundo +"; -fx-text-fill: "+corFonte);
        Platform.runLater(() -> {
            txtProducer.setBackground( new Background(new BackgroundFill(cor, CornerRadii.EMPTY, Insets.EMPTY)));
            txtProducer.setText(txt);
        });
    }

    public synchronized String getTextProducer(){
        return txtProducer.getText();
    }

    public synchronized void setTextConsumer(String txt){
        txtConsumer.setText(txt);
    }

    public synchronized void setTextConsumer(String txt, Color cor){
        //txtConsumer.setStyle("-fx-background-color: "+ corFundo +"; -fx-text-fill: "+corFonte);
        Platform.runLater(() -> {
            txtConsumer.setBackground( new Background(new BackgroundFill(cor, CornerRadii.EMPTY, Insets.EMPTY)));
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

    /*
    public synchronized void setTxtProducerWaiting(){
        //txtProducer.setStyle("-fx-background-color: green; -fx-text-fill: white");
    }

    public synchronized void setTxtProducerWorking(){
        //txtProducer.setStyle("-fx-background-color: white; -fx-text-fill: black");
    }

    public synchronized void setTxtConsumerWaiting(){
        //txtConsumer.setStyle("-fx-background-color: green; -fx-text-fill: white");
    }

    public synchronized void setTxtConsumerWorking(){
        //txtConsumer.setStyle("-fx-background-color: white; -fx-text-fill: black");
    } 
    */   
}