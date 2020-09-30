package prog.kiev;

import prog.kiev.exeptions.UnrealShapeExeptions;

public class Triangle extends Shape {
    private Point A;
    private Point B;
    private Point C;
    private double a;
    private double b;
    private double c;

    private void CheckTriangle() throws UnrealShapeExeptions {
        if( a + b > c ||
            b + c > a ||
            a + c > b){
            throw new UnrealShapeExeptions("not euclidean triangle");
        }
    }

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

    public Triangle(Point A,Point B, Point C) throws UnrealShapeExeptions{
        super();
        this.A = A;
        this.B = B;
        this.C = C;
        a = calculateDistance(B,C);
        b = calculateDistance(A,C);
        c = calculateDistance(A,B);
        CheckTriangle();
    }
}
