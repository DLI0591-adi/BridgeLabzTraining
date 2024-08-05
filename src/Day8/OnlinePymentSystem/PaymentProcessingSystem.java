package Day8.OnlinePymentSystem;
class PaymentFailedException extends Exception{
    public PaymentFailedException(String msg){
        super(msg);
    }
}
class InvalidPaymentDetailsException extends RuntimeException{
    InvalidPaymentDetailsException(String msg){
        super(msg);
    }
}
public class PaymentProcessingSystem {
    public void processPayment(String paymentDetails) throws PaymentFailedException{
        try{
            if(!validatePaymentDetails(paymentDetails)){
                throw new InvalidPaymentDetailsException("Invalid payment details.");
            }
            boolean tansictionStatus=processTransiction(paymentDetails);
            if(tansictionStatus){
                updatePaymentStatus("Success");
            }
            else{
                throw new PaymentFailedException("Transiction failed.");
            }
        }
        catch (InvalidPaymentDetailsException e){
            System.out.println(e.getMessage());
            throw e;
        }
        catch (PaymentFailedException e){
            System.out.println(e.getMessage());
            throw e;
        }catch (Exception e){
            System.out.println("An unexpected error occured : "+ e.getMessage());
        }
        throw new PaymentFailedException("An unexpected error occured during payment processing");

    }
    private boolean validatePaymentDetails(String paymentDetails){
        return paymentDetails!=null && !paymentDetails.isEmpty();
    }
    private boolean processTransiction(String paymentDetails){
        return true;
    }
    private void updatePaymentStatus(String status){
        System.out.println("Payment status : "+status);
    }

    public static void main(String[] args) {
        PaymentProcessingSystem p1=new PaymentProcessingSystem();
        try {
            p1.processPayment("ValidPaymentDetails");
        }
        catch (PaymentFailedException e){
            System.out.println("Payment Processing failed : "+e.getMessage());
        }
    }
}