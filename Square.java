package prog.kiev;

public class Square extends RegPolygon {
    private static final int N = 4;

    @Override
    public String toString() {
        return "Square{" +
                "side =" + a +
                '}';
    }

    public Square(){
        super();
    }
    public Square(Point A,Point B){
        super(A,B,N);
    }
}
