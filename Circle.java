package prog.kiev;

public class Circle extends Shape{
    private Point O;
    private Point R;
    private double r;

    public Point getO() {
        return O;
    }

    public Point getR() {
        return R;
    }

    @Override
    public double getPerimetr(){
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea(){
        double square = Math.PI * r * r;
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    public Circle(){
        super();
    }

    public Circle(Point O,Point R){
        super();
        this.O = O;
        this.R = R;
        r = calculateDistance(O,R);
    }
}
