package ru.kildeev.homework1;

public class Orange extends Fruit {
    private float weight = 1.5f;

    public Orange() {;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
