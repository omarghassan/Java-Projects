
package classes;

public class Circle {
    
    private double radius;
    
    public Circle()
    {
        radius = 1.0;
    }
    
    public Circle(double radius)
    {
        setRadius(radius);
    }
    
    public void setRadius(double radius)
    {
        if(radius > 0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 1.0;
        }
    }
    
    public double getRadius()
    {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}
