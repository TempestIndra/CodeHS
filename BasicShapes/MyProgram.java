public class MyProgram extends ConsoleProgram
{

    public void run()
    {
        Rectangle r1 = new Rectangle(10, 2);
        System.out.println(r1);
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
        System.out.println("");
        
        Triangle t1 = new Triangle(10, 2);
        System.out.println(t1);
        System.out.println("Area of t1: " + t1.getArea());
        System.out.println("");
        
        Square s1 = new Square(5);
        System.out.println(s1);
        System.out.println("Area of s1: " + s1.getArea());
        System.out.println("Perimeter of s1: " + s1.getPerimeter());
        System.out.println("");
        
        Circle c1 = new Circle(5);
        System.out.println(c1);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("");
        
    }
}
