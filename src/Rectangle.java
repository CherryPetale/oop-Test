public class Rectangle implements IShape{

    private final Point LeftTop;
    private final Point RightBottom;

    Rectangle(Point LeftTop, Point RightBottom){
        this.LeftTop = LeftTop;
        this.RightBottom = RightBottom;
    }

    public boolean contains(Point point){
        double tx = point.getX();
        double ty = point.getY();

        if(LeftTop.getX() < tx && LeftTop.getY() < ty &&
           RightBottom.getX() > tx && RightBottom.getY() > ty){
               return true;
           }

        return false;
    }
}