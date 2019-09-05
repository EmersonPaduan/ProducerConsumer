package app;

/**
 * Worker
 */
public class Worker extends Thread{

    private Tank tank;
    private boolean working;

    public Worker(Tank tank){
        this.tank = tank;
        working = true;
    }

    @Override
    public void run() {
        while(working){
            
        }
    }

    public void stopWork(){
        working = false;
    }

    public boolean isWorking() {
        return working;
    }
    
}