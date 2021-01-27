package prog.kiev;

public class Hexagon extends RegPolygon{
    private static final int N = 6;

    @Override
    public String toString() {
        return "Hexagon{" +
                "side =" + a +
                '}';
    }

    public Hexagon(){
        super();
    }
    public Hexagon(Point A,Point B){
        super(A,B,N);
    }
}
