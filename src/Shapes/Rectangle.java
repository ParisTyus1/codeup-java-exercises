package Shapes;


public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double width, double length) {//constructor that matches super//
        super(width, length);
    }

    @Override
    double setlength(double length) {
        return length;
    }

    @Override
    double setWidth(double width) {
        return width;
    }

    @Override
    public double getPerimeter() {
        return this.length*2 + this.width*2;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}


