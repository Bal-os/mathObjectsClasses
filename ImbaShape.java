package prog.kiev;

public class ImbaShape extends Shape {
    private Point[] A;

    private double triangleArea2 (double x1, double y1, double x2, double y2, double x3, double y3) {
        return (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
    }

    @Override
    public double getPerimetr(){
        double perimetr = 0;
        for(int i = 1; i < A.length; i++){
            perimetr += calculateDistance(A[i-1],A[i]);
        }
        perimetr += calculateDistance(A[0],A[A.length - 1]);
        return perimetr;
    }

    @Override
    public double getArea(){
        double area_2 = 0;
        for(int i = 2; i < A.length; i++){
            area_2 += triangleArea2(A[0].getX(),A[0].getY(),A[i-1].getX(),A[i-1].getY(),A[i].getX(),A[i].getY());
        }
        return Math.abs(area_2/2);
    }

    @Override
    public String toString() {
        return "Polygon{}";
    }

    public ImbaShape(){
        super();
    }

    public ImbaShape(Point ... A){
        super();
        this.A = A;
    }
}
