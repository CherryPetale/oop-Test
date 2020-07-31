public class Main {
    public static void main(String[] args) {
        Circle cl = new Circle(new Point(1.0, 1.0), 5.0);
        
        System.out.println("Circle: " + cl.contains(new Point(4.0, 6.0)));

    }
}