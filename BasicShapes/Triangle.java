public class Triangle
{
    private int height;
    private int width;
    
    public Triangle(int thewidth, int theheight)
    {
        height = theheight;
        width = thewidth;
    }

    public double getArea()
    {
       return (width * height * .5); 
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public String toString()
    {
        return "Triangle with width: " + width + " and height: " + height;
    }
    
}
