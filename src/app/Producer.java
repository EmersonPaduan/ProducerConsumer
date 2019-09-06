package app;

import java.util.Random;

import telas.TelaController;

/**
 * Producer
 */
public class Producer extends Worker {

    private TelaController controller;

    public Producer(Tank tank, TelaController controller) {
        super(tank);
        this.controller = controller;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        while (isWorking()) {
            int ciclo = rnd.nextInt(10) + 1; // numero de ciclos necessarios para gerar o item
            controller.setTextProducer("Produzindo ");
            // simulando a producao do item. Simula 1 segundo por ciclo
            for (int i = 0; i < ciclo; i++) {
                try {
                    sleep(1000);
                    controller.setTextProducer(controller.getTextProducer() + ".");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
            //acesso a regiao critica para inserir o item
            synchronized(getTank()){
                try{
                    controller.setTextProducer("EM ESPERA");
                    controller.setTxtProducerWaiting();
                    while(isWorking() && getTank().isFull()) {
                        //espera máxima e faz nova tentativa
                        getTank().wait(10000);
                    }
                }catch(Exception e){
                    System.out.println("Error on Producer wait: " + e.getMessage());
                    return;
                }
                controller.setTxtProducerWorking();
                getTank().add(ciclo);
                controller.setTextContainer(getTank().getAll());
                //notifica o consumidor
                getTank().notify();
            }
        }
        System.out.println("End Producer.");
    }
}