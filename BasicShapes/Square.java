public class Square
{
    private int sides;
    
    public Square(int theside)
    {
        sides = theside;
    }

    public int getArea()
    {
       return (sides * sides); 
    }
    
    public int getPerimeter()
    {
        return 4 * sides;
    }
    
    public String toString()
    {
        return "Square with sides: " + sides;
    }
}    
