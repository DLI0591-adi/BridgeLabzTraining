package Day4.ClaimTrackingSystem;

public class Claim {
    public Claim(String claim_number, String policy_number, String claimants_name, double claim_amount, String status) {
        this.claim_number = claim_number;
        this.policy_number = policy_number;
        this.claimants_name = claimants_name;
        this.claim_amount = claim_amount;
        this.status = status;
    }

    public String getClaim_number() {
        return claim_number;
    }

    public void setClaim_number(String claim_number) {
        this.claim_number = claim_number;
    }

    public String getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }

    public String getClaimants_name() {
        return claimants_name;
    }

    public void setClaimants_name(String claimants_name) {
        this.claimants_name = claimants_name;
    }

    public double getClaim_amount() {
        return claim_amount;
    }

    public void setClaim_amount(double claim_amount) {
        this.claim_amount = claim_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claim_number='" + claim_number + '\'' +
                ", policy_number='" + policy_number + '\'' +
                ", claimants_name='" + claimants_name + '\'' +
                ", claim_amount=" + claim_amount +
                ", status='" + status + '\'' +
                '}';
    }

    private String claim_number;
    private String policy_number;
    private String claimants_name;
    private double claim_amount;
    private String status;

}