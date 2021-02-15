package DZ.task1;

//  1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        Integer mass[] = {8, 6, 1, 4, 5, 9, 2}; // Зададим числовой массив
        swap(mass,1,5); // Сделаем смену мест 1 и 5 значения. Подсчет начинается с 0

    }

    public static void swap(Object[] mass, int i, int j){
        System.out.println("Исходное значение массива: "+ Arrays.toString(mass));
        Object swap = mass[i];
        mass[i]=mass[j];
        mass[j]=swap;
        System.out.println("Измененное значение массива: " + Arrays.toString(mass));
    }
}
