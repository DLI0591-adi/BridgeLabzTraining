package Day8.CustomerSystem;


import Day8.ClaimProcessingSystem.InvalidClaimAmountException;

public class InvalidCustomerDataException extends Exception{
    InvalidCustomerDataException(){
        super("the data provided is invalid");
    }
    void checkValid(CustomerManagementSystem c1) throws InvalidClaimAmountException {
        if(c1.getCid()<1000){
            throw new InvalidClaimAmountException();
        }
    }
}