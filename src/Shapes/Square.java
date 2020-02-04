package Shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);//what do you want it to do instead of what the parent is set for//

    }

    public int getPerimeter(int side) {
    return 4 * side;
    }


    public double getArea(int side) {
        return side * side;
    }
}

