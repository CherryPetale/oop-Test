public class Main {
    public static void main(String[] args) {
        Circle cl = new Circle(new Point(1.0, 1.0), 5.0);
        System.out.println("Circle: " + cl.contains(new Point(4.0, 6.0)));
        System.out.println("Circle: " + cl.contains(new Point(8.0, 6.0)));

        Rectangle sq = new Rectangle(new Point(1.0, 1.0), new Point(5.0, 5.0));
        System.out.println("Square: " + sq.contains(new Point(4.0, 3.0)));
        System.out.println("Square: " + sq.contains(new Point(0.0, 3.0)));

    }
}