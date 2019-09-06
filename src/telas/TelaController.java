package telas;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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


    public void setTextProducer(String txt){
        txtProducer.setText(txt);
    }

    public String getTextProducer(){
        return txtProducer.getText();
    }

    public void setTextConsumer(String txt){
        txtConsumer.setText(txt);
    }

    public String getTextConsumer(){
        return txtConsumer.getText();
    }

    public void setTextContainer(String txt){
        txtContainer.setText(txt);
    }

    public String getTextContainer(){
        return txtContainer.getText();
    } 

    public void setTxtProducerWaiting(){
        //txtProducer.setStyle("-fx-background-color: red; -fx-text-fill: white");
    }

    public void setTxtProducerWorking(){
        //txtProducer.setStyle("-fx-background-color: white; -fx-text-fill: black");
    }

    public void setTxtConsumerWaiting(){
        //txtConsumer.setStyle("-fx-background-color: red; -fx-text-fill: white");
    }

    public void setTxtConsumerWorking(){
        //txtConsumer.setStyle("-fx-background-color: white; -fx-text-fill: black");
    }    
}