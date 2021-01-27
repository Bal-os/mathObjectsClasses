package prog.kiev.exeptions;

public class outOfBoardException extends Exception{
    public outOfBoardException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
