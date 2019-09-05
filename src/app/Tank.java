package app;

import java.util.ArrayList;

/**
 * Tank - Classe representando o semáforo
 */
public class Tank {

    //Este array representa a região crítica
    private static ArrayList<Item> itens = new ArrayList<>();

    public static synchronized void add(int value){
        itens.add(new Item(value));
    }

    public static synchronized int remove(){
        int value = itens.get(0).getValue();

        itens.remove(itens.get(0));

        return value;
    }

    public String showAll(){
        String out="";

        for (Item item : itens) {
            out += item.getValue() + ";" ;
        }
        return out;
    }

}