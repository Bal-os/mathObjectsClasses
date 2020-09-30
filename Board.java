package prog.kiev;

import prog.kiev.exeptions.outOfBoardExeption;

public class Board {
    private final static int BOARDSIZE = 4;
    private Shape[] con = new Shape[BOARDSIZE];

    public Board(){
        super();
    }

    public Board(Shape ... con)throws outOfBoardExeption{
        super();
        if(con.length > BOARDSIZE) {throw new outOfBoardExeption("too much shapes");}
        this.con = con;
    }

    private void checkIndex(int n) throws NegativeArraySizeException, outOfBoardExeption{
        if(n < 0) {throw new NegativeArraySizeException();}
        if(n > BOARDSIZE) {throw new outOfBoardExeption("wrong index");}
    }

    public void addShape(Shape A) throws outOfBoardExeption{
        boolean flag = false;
        for(int i=0; (i < BOARDSIZE) && !flag; i++){
            if(con[i] == null) {
                con[i] = A;
                flag = true;
            }
        }
        if(!flag) {throw new outOfBoardExeption("bord is full");}
    }

    public void addShape(Shape A, int n) throws NegativeArraySizeException, outOfBoardExeption{
        checkIndex(n);
        con[n] = A;
    }

    public void delShape(int n) throws NegativeArraySizeException, outOfBoardExeption{
        checkIndex(n);
        con[n] = null;
    }

    public double getArea(){
        double sum = 0;
        for(Shape i: con){
            if(i != null){
                sum += i.getArea();
            }
        }
        return sum;
    }

    public String getMassage(){
        String sum = "";
        for(Shape i: con){
            if(i != null){
                sum += i.toString();
            }
        }
        return sum;
    }
}
