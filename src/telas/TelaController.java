package telas;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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


    // bloquear enventos do mouse no painel para evitar conflitos de atualização de tela
    // com os métodos usados pelas threads

    public TelaController(){
        //EventHandler<MouseEvent> handler = MouseEvent::consume;
        //painel.addEventFilter(MouseEvent.ANY, handler);
        //painel.setDisable(true);
    }

    public AnchorPane getPainel(){
        return painel;
    }
    
    public synchronized void setTextProducer(String txt){
        txtProducer.setText(txt);
    }

    public synchronized String getTextProducer(){
        return txtProducer.getText();
    }

    public synchronized void setTextConsumer(String txt){
        txtConsumer.setText(txt);
    }

    public synchronized String getTextConsumer(){
        return txtConsumer.getText();
    }

    public synchronized void setTextContainer(String txt){
        txtContainer.setText(txt);
    }

    public synchronized String getTextContainer(){
        return txtContainer.getText();
    } 

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
}