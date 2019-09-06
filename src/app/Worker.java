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

    protected Tank getTank(){
        return tank;
    }
    
    public void stopWork(){
        working = false;
    }

    public boolean isWorking() {
        return working;
    }
    
}