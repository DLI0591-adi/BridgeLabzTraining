package Day8.PolicyApplicationProcess;
public class PoorDrivingException extends Exception{
    PoorDrivingException(){
        super("You have a bad driving history");
    }
    public void checkDrivingHistory(String dh) throws PoorDrivingException {
        if(dh.equals("bad"))
            throw new PoorDrivingException();

    }
}
