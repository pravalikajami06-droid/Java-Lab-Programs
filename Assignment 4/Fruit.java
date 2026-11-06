class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " has a " + taste + " taste.");
    }
}

class Apple extends Fruit {
    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println(name + " is sweet and crunchy.");
    }
}

class Orange extends Fruit {
    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println(name + " is juicy and sour.");
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Sweet", "Medium");
        Orange o = new Orange("Orange", "Sour", "Medium");

        a.eat();
        o.eat();
    }
}