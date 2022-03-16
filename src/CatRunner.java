import java.util.ArrayList;

public class CatRunner {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("Billy");
        Cat cat3 = new Cat("Ben");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Toby");
        Cat replacedCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replacedCat);
        Cat catAt1 = cats.get(1);
        catAt1.setName(catAt1.getName() + " Meow");
        System.out.println(cats);
        cats.add(new Cat("Sam"));
        System.out.println(cats);
    }

}