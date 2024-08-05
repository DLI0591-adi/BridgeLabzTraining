package Day6.insurance;

public class Policy {
    private String policyNumber;
    private String holderName;
    private double premiumAmount;
    Policy(String policyNumber,String holderName,double premiumAmount){
        this.policyNumber=policyNumber;
        this.holderName=holderName;
        this.premiumAmount=premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
    public int compareTo(Policy p){
        return p.getHolderName().compareTo(this.getHolderName());
    }
    public double comparetoo(Policy o){
        return (double) Double.compare(o.getPremiumAmount(),this.getPremiumAmount());
    }
}