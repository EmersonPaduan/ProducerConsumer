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
                }
            }
            //acesso a regiao critica para inserir o item
            synchronized(getTank()){
                getTank().add(ciclo);
                controller.setTextContainer(getTank().showAll());
                getTank().notify();
            }
            
        }
        System.out.println("End Producer.");
    }
}