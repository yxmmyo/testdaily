import sun.java2d.loops.DrawGlyphList;

class Shape {
    public void draw() {

    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪圈");
    }
}
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个长方形");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
public class TestDemo06152 {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new Flower();
        drawMap(shape1);
        drawMap(shape2);


    }
}
