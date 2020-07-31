public class Square implements IShape{

    private final Point Center;
    private final double SideLength;

    Square(Point Center, double SideLength){
        this.Center = Center;
        this.SideLength = SideLength;
    }

    public boolean contains(Point point) {

        if(distance(point.getX(), this.Center.getX()) >= this.SideLength / 2 &&
           distance(point.getY(), this.Center.getY()) >= this.SideLength / 2){
            return true;
        }

        return false;
    }
    
    private double distance(double a, double b){
        return Math.abs(a - b);
    }

}