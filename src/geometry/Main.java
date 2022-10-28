package geometry;

public class Main {public static void main(String args[]){
    Point p1 = new Point();
    Point p2 = new Point(3, 5);
    Point p3 = new Point(5, 6, true);

    System.out.println("p1 tacka" + p1.getX());
    System.out.println("p2 tacka" + p2.getX());

    Line l1 = new Line();
    Line l2 = new Line(p2, p3);
    Line l3 = new Line(new Point(3, 2), new Point(5, 6));
    Line l4 = new Line(new Point(), new Point());

    Circle c1 = new Circle();
    Circle c2 = new Circle(p2, 3);
    Circle c3 = new Circle(new Point(3, 2), 5);
    Circle c4 = new Circle(p1, 5, true);
    Circle c5 = new Circle(new Point(3, 2), 5, true);
}

}
