public class Shape {


private String color = "white";

public double area() {
    return 0.0;
}

    public void describe(){
        System.out.println("this is a shape and color is:" + this.color);

    }
    public double perimeter() {

        return 0.0;
    }

    public void describe ( int sideA, int sideB){

        System.out.println("Side a is" + sideA + "Side b is" + sideB);

    }

    public void describe ( int sideA){
        System.out.println("Side a is:" + sideA);

    }


}

