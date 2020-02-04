package Shapes;

public class ShapeTest {


        public static void main(String[] args){

            Rectangle box1 = new Rectangle(4,5);//remembers which class your referencing//Rectangle class//
            System.out.println("Area is : " + box1.getArea());
            System.out.println("Perimeter is :" + box1.getPerimeter());

            Rectangle box2 = new Square(5);//remembers which class your referencing//
            System.out.println("Area is :" + box2.getArea());
            System.out.println("Perimeter is :" + box2.getPerimeter());




        }
}
