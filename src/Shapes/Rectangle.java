package Shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length){//constructor for rectangle//
        this.width = width;
        this.length = length;
    }

    public int getArea() {//method being applied to the constructor//
        return width * length ;
    }

    public int getPerimeter() {//method being applied to the constructor//
        return 2*width + 2*length;
    }
}
