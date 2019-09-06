package app;

import java.util.ArrayList;

/**
 * Tank - Classe representando a região crítica
 */
public class Tank {

    private ArrayList<Item> itens = new ArrayList<>();

    public void add(int value){
        itens.add(new Item(value));
    }

    public int remove(){
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