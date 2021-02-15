package DZ.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box(){

    }
    public float getWeight(){
        float weight = 0.2f;
        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }
    public boolean compare(Box Box2) {
        if(getWeight() == Box2.getWeight())
            return true;
        return false;
    }

    public void addFruit(T fruit, int amount){
        for(int i = 0; i < amount; i++){
            box.add(fruit);
        }
    }

    public void pourTo(Box <T> Box2){
        Box2.box.addAll(box);
        box.clear();
    }
}
