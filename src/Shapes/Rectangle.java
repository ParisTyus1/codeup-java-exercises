package Shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length){//constructor for rectangle//
        this.width = width;
        this.length = length;
    }

    public int getArea() {return this.width * this.length ; }//method being applied to the constructor//

    public int getPerimeter() {return 2 * this.width + 2 * this.length; }//method being applied to the constructor//
}
