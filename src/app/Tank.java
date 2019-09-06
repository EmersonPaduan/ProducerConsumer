package app;

import java.util.ArrayList;

/**
 * Tank - Classe representando a região crítica
 */
public class Tank {

    private ArrayList<Item> itens = new ArrayList<>();
    private final int MAX_ITENS;

    public Tank(int max_itens){
        this.MAX_ITENS = max_itens;
    }

    public boolean isFull(){
        return itens.size() == MAX_ITENS;
    }

    public boolean isEmpty(){
        return itens.size() == 0;
    }

    public boolean hasItens(){
        return itens.size() > 0;
    }

    public void add(int value){
        if(isFull()) return;

        itens.add(new Item(value));
    }

    public int remove(){
        if(isEmpty()) return -1;

        int value = itens.get(0).getValue();

        itens.remove(itens.get(0));

        return value;
    }

    public String getAll(){
        String out="";

        for (Item item : itens) {
            out += item.getValue() + ";" ;
        }
        return out;
    }

}