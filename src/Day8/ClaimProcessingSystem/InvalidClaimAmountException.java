package Day8.ClaimProcessingSystem;


public class InvalidClaimAmountException extends Exception{
    public InvalidClaimAmountException(){
        super("you claim amount is greater than insured amount");
    }
}