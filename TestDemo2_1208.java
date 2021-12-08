class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name+"正在吃"+food);
    }
}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}

class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(this.name + "正在游");
    }
}
public class TestDemo2_1208 {
    public static void main(String[] args) {
        Animal animal = new Animal("狗");
        animal.eat("狗粮");
        Bird bird = new Bird("喜鹊");
        bird.eat("虫子");
        bird.fly();
        Fish fish = new Fish("小鱼");
        fish.eat("水草");
        fish.swim();
    }
}
