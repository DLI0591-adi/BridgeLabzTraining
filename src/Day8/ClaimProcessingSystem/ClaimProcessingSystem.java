package Day8.ClaimProcessingSystem;



import java.util.Date;

public class ClaimProcessingSystem {
    private double claimAmount;
    private Date claimDate;
    ClaimProcessingSystem(double claimAmount,Date claimDate){
        this.claimAmount=claimAmount;
        this.claimDate=claimDate;
    }
    void processClaim(double claimAmount,Date claimDate) throws InvalidClaimAmountException, FradulentClaimException {
        if(claimAmount>this.claimAmount)
            throw new InvalidClaimAmountException();
        if(claimDate.after(this.claimDate))
            throw new FradulentClaimException();
    }

    public static void main(String[] args) {

        ClaimProcessingSystem system1=new ClaimProcessingSystem(5000,new Date(123,8,2));
        ClaimProcessingSystem system2=new ClaimProcessingSystem(4000,new Date(123,8,2));
        try{
            system1.processClaim(6000,new Date(123,8,2));
        }
        catch (InvalidClaimAmountException e){
            System.out.println(e.getMessage());
        }
        catch (FradulentClaimException e){
            System.out.println(e.getMessage());
        }
        try{
            system2.processClaim(2000,new Date(124,4,4));
        }
        catch (InvalidClaimAmountException e){
            System.out.println(e.getMessage());
        }
        catch (FradulentClaimException e){
            System.out.println(e.getMessage());
        }

    }
}
