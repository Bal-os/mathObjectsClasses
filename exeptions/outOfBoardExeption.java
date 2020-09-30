package prog.kiev.exeptions;

public class outOfBoardExeption extends Exception{
    public outOfBoardExeption(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
