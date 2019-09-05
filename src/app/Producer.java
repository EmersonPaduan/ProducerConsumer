package app;

import java.util.Random;

/**
 * Producer
 */
public class Producer extends Worker {

    public Producer(Tank tank) {
        super(tank);
    }

    @Override
    public void run() {
        Random rnd = new Random();
        while (isWorking()) {
            int ciclo = rnd.nextInt(10) + 1; // numero de ciclos necessarios para gerar o item
            System.out.print("Produzindo");
            // simulando a producao do item. Simula 1 segundo por ciclo
            for (int i = 0; i < ciclo; i++) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            //acesso a regiao critica para inserir o item
            synchronized(getTank()){
                getTank().add(ciclo);
                System.out.println(getTank().showAll());
                getTank().notify();
            }
            
        }
    }
}