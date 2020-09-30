package prog.kiev;

public abstract class RegPolygon extends Shape {
    private int n;
    protected Point A;
    protected Point B;
    protected double a;

    public Point getA(){
        return A;
    }
    public Point getB(){
        return B;
    }

    @Override
    public double getPerimetr(){
        return n * a;
    }

    @Override
    public double getArea(){
        double angle = Math.PI / n;
        double square = n * a * a / (4 * Math.tan(angle));
        return square;
    }

    public RegPolygon(){
        super();
    }
    public RegPolygon(Point A, Point B, int n){
        this.A = A;
        this.B = B;
        this.n = n;
        a = calculateDistance(A,B);
    }
}
