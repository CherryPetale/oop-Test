public class Circle implements IShape{

    private final Point center;
    private final double radius;

    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public boolean contains(Point point) {

        if(distance(this.center.getX(), point.getX()) <= radius &&
           distance(this.center.getY(), point.getY()) <= radius){
            return true;
        }

        return false;
    }

    private double distance(double a, double b){
        return Math.abs(a - b);
    }
}