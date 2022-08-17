package ru.kildeev.homework1;

import java.util.ArrayList;

//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
public class MainApp {

    public static void main(String[] args) {
        GenericArray<String> firstArray = new GenericArray<>(new String[]{"hello", "world", "earth", "planet"});
        GenericArray<Integer> secondArray = new GenericArray<>(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        GenericArray<GenericArray<Integer>> thirdArray = new GenericArray<>(new GenericArray[]{firstArray, secondArray});

        System.out.println("------------First task------------");
        System.out.println(thirdArray.arraySwap(0,1));
        System.out.println(firstArray.arraySwap(1,2));
        System.out.println(secondArray.arraySwap(3,0));

        System.out.println("------------Second task------------");
        System.out.println(firstArray.arraySwitchToList());
        System.out.println(secondArray.arraySwitchToList());

        System.out.println("------------Third task------------");
        Box<Apple> boxApples = new Box<>(new ArrayList<>());
        for (int i = 0; i < 6; i++) {
            boxApples.addFruit(new Apple());
        }
        Box<Apple> boxApples2 = new Box<>(new ArrayList<>());
        for (int i = 0; i < 4; i++) {
            boxApples2.addFruit(new Apple());
        }
        Box<Orange> boxOranges = new Box<>(new ArrayList<>());
        for (int i = 0; i < 4; i++) {
            boxOranges.addFruit(new Orange());
        }
        System.out.println(boxApples.getWeight());
        System.out.println(boxOranges.getWeight());
        System.out.println(boxApples.compare(boxOranges));
        boxApples.switchFruitsToAnotherBox(boxApples2);
        System.out.println(boxApples.getWeight());
        System.out.println(boxApples2.getWeight());


    }

}
