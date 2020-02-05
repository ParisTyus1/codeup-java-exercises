package Shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
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
        this.length = length;
        this.width = length;
        return length;
    }

    @Override
    double setWidth(double width) {
        this.width = width;
        this.length = width;
        return width;
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

