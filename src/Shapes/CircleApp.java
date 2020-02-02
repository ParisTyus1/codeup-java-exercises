package Shapes;

    import util.Input;

    public class CircleApp {
        public static void main(String[] args) {
            Input input = new Input();
            do {
                double radius = input.getDouble("What is the radius of the circle?");
                Circle circle = new Circle(radius);
                System.out.println("Area of circle = " + circle.getArea());
                System.out.println("Circumference = " + circle.getCircumference());
                //        System.out.println(circle.radius); // no access
            } while (input.yesNo("Do you want to make another?"));
            System.out.println(Circle.getCirclesCreated() + " circles created.");
        }
}
