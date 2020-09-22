package prog.kiev;



public class main {
    public static void main(String[] args) {
        Board board = new Board(new ImbaShape(new Point(0,0), new Point(0,2),new Point(2,2), new Point(4,1), new Point(1,0)),
                          new Hexagon(new Point(0,0), new Point(0,2)),
                          new Triangle(new Point(0,0), new Point(0,2), new Point(3,0)));
        System.out.println(board.getArea());
        System.out.println(board.getMassage());
    }
}
