package Day11.insurancepolicy;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        manager.readPolicies("src/Day11/insurancepolicy/policies.txt");
        manager.writeSummary("src/Day11/insurancepolicy/summary.txt");
    }
}
