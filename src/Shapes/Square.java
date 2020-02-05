package Shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);//what do you want it to do instead of what the parent is set for//

    }

    public double getPerimeter() {
        return this.width *2 + this.length *2;
    }

    public double getArea() {
        return this.length * this.width;
    }

    @Override
    double setlength(double length) {
        return 0;
    }

    @Override
    double setWidth(double width) {
        return 0;
    }

//    public int getPerimeter(int side) {
//    return 4 * side;
//    }
//
//
//    public double getArea(int side) {
//        return side * side;
//    }
}

