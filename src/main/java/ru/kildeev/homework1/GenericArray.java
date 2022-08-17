package ru.kildeev.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericArray <T> {
    private T[] array;
    private List<T> arrayList;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public GenericArray<T> arraySwap(int firstElement, int secondElement) {
        T cashedElement = this.array[firstElement];
        this.array[firstElement] = this.array[secondElement];
        this.array[secondElement] = cashedElement;
        return this;
    }

    public GenericArray<T> arraySwitchToList(){
        this.arrayList = new ArrayList<>(List.of(this.array));
        this.array = null;
        return this;
    }

    @Override
    public String toString() {
        return "GenericArray{" +
                "array=" + Arrays.toString(array) +
                ", arrayList=" + arrayList +
                '}';
    }
}
