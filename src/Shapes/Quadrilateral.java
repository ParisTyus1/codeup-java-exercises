package Shapes;


public abstract class Quadrilateral extends Shape implements Measurable {
    protected double width;
    protected double length;

    public Quadrilateral(double width, double length){//constructor for rectangle//
        this.width = width;
        this.length = length;

    }

    //getters//
    public double getlength() { return this.length; }//method being applied to the constructor//

    public double getWidth() {return this.width;}//method being applied to the constructor//

    //setters//
     abstract double setlength(double length);//do I need a method body??//

     abstract double setWidth(double width);





}
