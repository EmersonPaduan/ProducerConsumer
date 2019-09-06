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
        while(isWorking()){
            
        }
        System.out.println("End Consumer.");
    }


}