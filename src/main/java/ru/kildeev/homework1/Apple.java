package ru.kildeev.homework1;

public class Apple extends Fruit{
    private float weight = 1.0f;

    public Apple() {;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
