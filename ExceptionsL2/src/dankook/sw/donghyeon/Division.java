package dankook.sw.donghyeon;

public class Division {
    public static int divide(int numberToDivide, int numberToDivideBy)
            throws BadNumberException{
        if(numberToDivideBy == 0){
            throw new BadNumberException("Cannot divide by 0");
        }
        return numberToDivide / numberToDivideBy;
    }

    public static void callDivide(){
        try {
            int result = divide(2,1);
            System.out.println(result);
        } catch (BadNumberException e) {
            //do something clever with the exception
            System.out.println(e.getMessage());
        }
        System.out.println("Division attempt done");
    }

    public static void callDivide2() throws BadNumberException{
        int result = divide(2,0);
        System.out.println(result);
    }
}
