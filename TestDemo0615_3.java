import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface Flying {
    void fly();
}
interface Running {
    void run();
}
interface Swimming {
    void swim();
}
class Cat extends Animal implements Running {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在用四条腿跑");
    }
}
class Bird extends Animal implements Flying,Running {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在拼命飞");
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用两条腿跑");
    }
}
class Duck extends Animal implements Running,Flying,Swimming {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用双脚跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }
}
 class TestDemo0615_3 {
    public static void walk(Running running) {
        System.out.println("我和小伙伴去散步");
    }
    public static void main(String[] args) {
        Cat cat = new Cat("加菲猫");
        walk(cat);
        cat.run();
        Duck duck = new Duck("小黄鸭");
        walk(duck);
        duck.run();
    }
}
