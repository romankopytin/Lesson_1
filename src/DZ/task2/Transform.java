package DZ.task2;

//  2. Написать метод, который преобразует массив в ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Transform {
    public static void main(String[] args) {
        String[] arrayOfString = {"Один", "Два", "Три"};
        asList(arrayOfString);
    }

    public static <T> void asList(T[]mass){
        ArrayList<T> trans = new ArrayList<>(Arrays.asList(mass));
        System.out.println("Массив преобразованный к ArrayList : " + trans);
    }
}
