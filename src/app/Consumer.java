package app;

import telas.TelaController;

/**
 * Consumer
 */
public class Consumer extends Worker {

    private TelaController controller;

    public Consumer(Tank tank, TelaController controller) {
        super(tank);
        this.controller = controller;
    }

    @Override
    public void run() {
        int value;
        while (isWorking()) {
            // acesso a regiao critica para remover o item
            synchronized (getTank()) {
                if (getTank().hasItens()) {
                    controller.setTxtConsumerWorking();
                    value = getTank().remove();
                    controller.setTextConsumer("Removido: " + value);
                    controller.setTextContainer(getTank().getAll());
                    // notifica o produtor
                    getTank().notify();

                } else { // Vazio

                    try {
                        controller.setTextConsumer("EM ESPERA");
                        controller.setTxtConsumerWaiting();
                        while (isWorking() && getTank().isEmpty()) {
                            getTank().wait(10000); // espera máxima e tenta novamente
                        }
                    } catch (Exception e) {
                        System.out.println("Error on Consumer wait: " + e.getMessage());
                        return;
                    }
                }

                // simula 5 seg para consumir o item.
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }

        }
        System.out.println("End Consumer.");
    }

}