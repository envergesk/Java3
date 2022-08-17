package ru.kildeev.homework1;

import java.util.List;

//f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
// (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
// соответственно в текущей коробке фруктов не остается,
// а в другую перекидываются объекты, которые были в этой коробке;
public class Box <T extends Fruit>{
    private List<T> fruits;

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }
    public void removeFruit(T fruit){
        fruits.remove(fruit);
    }
    public float getWeight(){
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
    public boolean compare(Box<?> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void switchFruitsToAnotherBox(Box<T> box){
        for (T fruit : this.fruits) {
            box.addFruit(fruit);
        }
        this.fruits.clear();
    }
}
