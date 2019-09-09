package app;

import telas.TelaController;

/**
 * Consumer
 */
public class Consumer extends Worker {

    private TelaController controller;

    public Consumer(Tank tank, TelaController controller) {
        super(tank, "Consumidor");
        this.controller = controller;
    }

    @Override
    public void run() {
        int value;
        while (isWorking()) {
            // acesso a regiao critica para remover o item
            synchronized (getTank()) {
                if (getTank().hasItens()) {
                    value = getTank().remove();
                    controller.setTextConsumer("Removido: " + value, "black", "white");
                    controller.setTextContainer(getTank().getAll());
                    // notifica o produtor
                    getTank().notify();

                } else { // Vazio
                    value = -1;
                    try {
                        controller.setTextConsumer("EM ESPERA", "white", "green");
                        while (isWorking() && getTank().isEmpty()) {
                            getTank().wait(10000); // espera máxima e tenta novamente
                        }
                    } catch (Exception e) {
                        controller.setTextConsumer("ERRO!", "white", "red");
                        System.out.println("Error on Consumer wait: " + e.getMessage());
                        return;
                    }
                }
            }

            if (value > 0) {
                // simula 5 seg para consumir o item. (Fora da região crítica)
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    controller.setTextConsumer("ERRO!", "white", "red");
                    System.out.println(e.getMessage());
                    return;
                }
            }

        }
        System.out.println("End Consumer.");
    }

}