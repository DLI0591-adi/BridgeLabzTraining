package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum PolicyType {
    LIFE,
    HEALTH,
    AUTO,
    HOME,
    TRAVEL
}

class PolicyHolder {
    int holderId;
    String name;
    int age;
    double premiumAmount;
    PolicyType policyType;

    @Override
    public String toString() {
        return "PolicyHolder{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", premiumAmount=" + premiumAmount +
                ", policyType=" + policyType +
                '}';
    }

    public PolicyHolder(int holderId, String name, int age, double premiumAmount, PolicyType policyType) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.premiumAmount = premiumAmount;
        this.policyType = policyType;
    }
}

class RiskAssessment {
    int holderId;
    String name;
    double riskScore;

    public RiskAssessment(int holderId, String name, double riskScore) {
        this.holderId = holderId;
        this.name = name;
        this.riskScore = riskScore;
    }

    @Override
    public String toString() {
        return "RiskAssessment{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", riskScore=" + riskScore +
                '}';
    }
}

public class PolicyHolderRisk {
    public static void main(String[] args) {
        List<PolicyHolder> list = new ArrayList<>();
        list.add(new PolicyHolder(1, "John Doe", 70, 500.0, PolicyType.LIFE));
        list.add(new PolicyHolder(2, "Jane Smith", 40, 600.0, PolicyType.HEALTH));
        list.add(new PolicyHolder(3, "Alice Johnson", 35, 700.0, PolicyType.AUTO));
        list.add(new PolicyHolder(4, "Bob Brown", 50, 800.0, PolicyType.HOME));
        list.add(new PolicyHolder(5, "Charlie Davis", 45, 900.0, PolicyType.TRAVEL));

        System.out.println("Filter : ");
        list.stream().filter(a -> a.policyType.equals("LIFE") && a.age > 60).forEach(System.out::println);

        System.out.println("\nTransform : ");
        List<RiskAssessment> newlist = new ArrayList<>();
        for (PolicyHolder e : list) {
            newlist.add(new RiskAssessment(e.holderId, e.name,e.premiumAmount/e.age ));
        }
        newlist.forEach(System.out::println);

        System.out.println("\n SOrt : ");
        List<RiskAssessment> collect = newlist.stream().sorted((a, b) -> Double.compare(b.riskScore, a.riskScore)).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("\nCategorized data :");
        Map<String, List<RiskAssessment>> mp = newlist.stream().collect(Collectors.groupingBy(a ->a.riskScore >0.5 ? "High Risk":"Low Risk"));
        mp.forEach((K,V) -> System.out.println(" Key : "+K+" Values : "+V.toString()));


    }
}