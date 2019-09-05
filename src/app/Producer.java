package app;

/**
 * Producer
 */
public class Producer extends Worker{

    public Producer(Tank tank){
       super(tank);
    }

    @Override
    public void run() {
        while(isWorking()){
            
        }
    }
}