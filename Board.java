package prog.kiev;

public class Board {
    private Shape[] con = new Shape[4];

    public void addShape(Shape A, int n){
        con[n] = A;
    }

    public void delShape(int n){
        con[n] = new Circle();
    }

    public double getArea(){
        double sum = 0;
        for(Shape i: con){
            sum += i.getArea();
        }
        return sum;
    }

    public String getMassage(){
        String sum = "";
        for(Shape i: con){
            sum += i.toString();
        }
        return sum;
    }

    public Board(){
        super();
    }
    public Board(Shape ... con){
        super();
        this.con = con;
    }
}
