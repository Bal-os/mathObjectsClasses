package prog.kiev;

public class Triangle extends Shape {
    private Point A;
    private Point B;
    private Point C;
    private double a;
    private double b;
    private double c;

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    @Override
    public double getPerimetr(){
        return a + b + c;
    }

    @Override
    public double getArea(){
        double p = this.getPerimetr()/2;
        double square = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
        return square;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public Triangle(){
        super();
    }

    public Triangle(Point A,Point B, Point C){
        super();
        this.A = A;
        this.B = B;
        this.C = C;
        a = calculateDistance(B,C);
        b = calculateDistance(A,C);
        c = calculateDistance(A,B);
    }
}
