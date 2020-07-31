public class Circle implements IShape{

    private final Point center;
    private final double radius;

    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public boolean contains(Point point) {

        if(this.center.getX() + radius >= point.getX() &&
           this.center.getY() + radius >= point.getY()){
            return true;
        }
        return false;
    }
}