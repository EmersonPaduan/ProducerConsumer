package app;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import telas.TelaController;

/**
 * Aplicação dos conceitos de Semáforos e Sleeep/Wake up em Produtor/Consumidor
 * Disciplina: Sistemas Operacionais
 * 
 * @author Emerson S. Paduan
 * @version 0.1
 * 
 */

public class App extends Application {

    public static void main(String[] args) throws Exception {

        launch(args);
        /*
        Tank tank = new Tank();
        Producer producer = new Producer(tank);
        Consumer consumer = new Consumer(tank);

        producer.start();
        consumer.start();
        */
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        URL url = getClass().getResource("../telas/Tela2.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader(url);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Exemplo SO v0.1");

        //TelaController controller = (TelaController) fxmlLoader.getController();

        stage.show();
    }
}