package DZ.task3;

//  3. Большая задача:
//  a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//  b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
//  поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//  c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//  d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и
//  вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//  e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
//  которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае
//  (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//  f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую
//  коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
//  соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
//  которые были в этой коробке;
//  g. Не забываем про метод добавления фрукта в коробку.

public abstract class Fruit {
    abstract float getWeight();

    public static void main(String[] args) {
        Box<Orange> o = new Box<> ();
        Box<Orange> o1 = new Box<> ();
        Box<Apple> a = new Box<> ();
        Box<Apple> a1 = new Box<> ();

        o.addFruit ( new Orange (), 5 );
        o1.addFruit ( new Orange (), 6 );
        a.addFruit ( new Apple (), 12 );
        a1.addFruit ( new Apple (), 6 );
        System.out.println ( "Коробка с апельсинами: " + o.getWeight () );
        System.out.println ( "Коробка с апельсинами: " + o1.getWeight () );
        System.out.println ( "Коробка с яблоками: " + a.getWeight () );
        System.out.println ( "Коробка с яблоками: " + a1.getWeight () );

        o.pourTo ( o1 );
        a.pourTo ( a1 );

        System.out.println ("\nПереложим все фрукты в коробки по виду фрукта.\n");
        System.out.println ( "Коробка со всеми апельсинами: " + o1.getWeight () );
        System.out.println ( "Коробка со всеми яблоками: " + a1.getWeight () );
    }
}
