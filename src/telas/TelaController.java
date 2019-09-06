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

    public void setTextContainer(String txt){
        txtContainer.setText(txt);
    }

    public String getTextContainer(){
        return txtContainer.getText();
    } 
    
}