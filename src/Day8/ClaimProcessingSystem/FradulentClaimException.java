package Day8.ClaimProcessingSystem;

public class FradulentClaimException extends Exception{
    FradulentClaimException(){
        super("you have provided wrong claim date");
    }
}