package prog.kiev;

import prog.kiev.exeptions.outOfBoardException;

public class Board {
    private final static int BOARDSIZE = 4;
    private Shape[] con = new Shape[BOARDSIZE];

    public Board(){
        super();
    }

    public Board(Shape ... con)throws outOfBoardException {
        super();
        if(con.length > BOARDSIZE) {throw new outOfBoardException("too much shapes");}
        this.con = con;
    }

    private void checkIndex(int n) throws NegativeArraySizeException, outOfBoardException {
        if(n < 0) {throw new NegativeArraySizeException();}
        if(n > BOARDSIZE) {throw new outOfBoardException("wrong index");}
    }

    public void addShape(Shape A) throws outOfBoardException {
        boolean flag = false;
        for(int i=0; (i < BOARDSIZE) && !flag; i++){
            if(con[i] == null) {
                con[i] = A;
                flag = true;
            }
        }
        if(!flag) {throw new outOfBoardException("bord is full");}
    }

    public void addShape(Shape A, int n) throws NegativeArraySizeException, outOfBoardException {
        checkIndex(n);
        con[n] = A;
    }

    public void delShape(int n) throws NegativeArraySizeException, outOfBoardException {
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
