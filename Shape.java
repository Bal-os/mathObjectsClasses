package prog.kiev;

abstract class Shape {
    abstract double getPerimetr();
    abstract double getArea();

    protected double calculateDistance(Point A, Point B){
        double x = A.getX() - B.getX();
        double y = A.getY() - B.getY();
        double distance = Math.sqrt(x*x + y*y);
        return distance;
    }
}
