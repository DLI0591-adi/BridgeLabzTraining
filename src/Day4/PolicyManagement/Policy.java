package Day4.PolicyManagement;

import java.util.ArrayList;
import java.util.List;

public class Policy {
    public Policy(String policyNumber, String policyHolderName, String typeOfInsurance, double coverageAmount) {
        PolicyNumber = policyNumber;
        PolicyHolderName = policyHolderName;
        TypeOfInsurance = typeOfInsurance;
        CoverageAmount = coverageAmount;
    }

    public String getPolicyNumber() {
        return PolicyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        PolicyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return PolicyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        PolicyHolderName = policyHolderName;
    }

    public String getTypeOfInsurance() {
        return TypeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        TypeOfInsurance = typeOfInsurance;
    }

    public double getCoverageAmount() {
        return CoverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        CoverageAmount = coverageAmount;
    }

    private String PolicyNumber;
    private String PolicyHolderName;
    private String TypeOfInsurance;
    private double CoverageAmount;

    @Override
    public String toString() {
        return "Policy{" +
                "PolicyNumber='" + PolicyNumber + '\'' +
                ", PolicyHolderName='" + PolicyHolderName + '\'' +
                ", TypeOfInsurance='" + TypeOfInsurance + '\'' +
                ", CoverageAmount=" + CoverageAmount +
                '}';
    }
}