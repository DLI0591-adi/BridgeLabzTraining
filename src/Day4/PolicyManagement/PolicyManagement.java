package Day4.PolicyManagement;

import java.util.ArrayList;
import java.util.List;

public class PolicyManagement {
    List<Policy> policies = new ArrayList<>();
    public void addPolicy(Policy policy){
        policies.add(policy);
    }
    public void removePolicy(String policyNumber){
        for(int i=0;i< policies.size();i++){
            if(policies.get(i).getPolicyNumber().equals(policyNumber))policies.remove(policies.get(i));
        }
    }
    public void updatePolicy(String policyNumber,Policy newpolicy){
        for(int i=0;i<policies.size();i++){
            if(policies.get(i).getPolicyNumber().equals(policyNumber)){
                policies.set(i,newpolicy);
                return;
            }
        }
    }
    public void policyOfSpecificType(String policyType){
        for(Policy policy: policies){
            if(policy.getTypeOfInsurance().equals(policyType)){
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args) {
        PolicyManagement policyManagement = new PolicyManagement();
        Policy policy = new Policy("1","Saket","Life",2500000);
        Policy policy1 = new Policy("2","Harsh","General",5000000);
        Policy policy2 = new Policy("3","Aryan","Life",2500000);
        policyManagement.addPolicy(policy);
        policyManagement.addPolicy(policy1);
        policyManagement.addPolicy(policy2);
        policyManagement.policyOfSpecificType("General");
        Policy newpolicy1 = new Policy("2","HarshJi","General",5000000);
        policyManagement.updatePolicy("2",newpolicy1);
        policyManagement.removePolicy("1");
        policyManagement.policyOfSpecificType("Life");
    }
}