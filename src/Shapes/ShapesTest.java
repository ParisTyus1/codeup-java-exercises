package Shapes;

public class ShapesTest {
        public static void main(String[] args){

            Rectangle box1 = new Rectangle(4,5);//only way to confirm is to put notes in and sees//
            System.out.println("Perimeter is :" + box1.getPerimeter());
            System.out.println("Area is : " + box1.getArea());


            Rectangle box2 = new Square(5);
            System.out.println("Perimeter is :" + box2.getPerimeter());
            System.out.println("Area is :" + box2.getArea());
//only way to confirm is to put notes in and see//understanding where the methods are being called from//




        }
}
