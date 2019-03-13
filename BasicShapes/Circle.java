public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }
    
    public double getRadius()
    {
        return radius;   
    }
    
    public String getArea()
    {
        return String.format("%.5g%n", Math.PI* Math.pow(radius, 2));
    }
    
    public String getPerimeter()
    {
        return String.format("%.5g%n", 2 * Math.PI * radius);
    }
    
    public String toString()
    {
        return "Circle with radius: " + radius;
    }
}    
