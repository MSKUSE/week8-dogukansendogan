public class Rectangle extends Shape {

    private int sideA = 0, sideB = 0;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void describe() {
        System.out.println("Side a is " + this.sideA + " Side b is " + this.sideB);
        super.describe();
    }

    private int sideA=0

    }
}
