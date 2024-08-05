package Day6.insurance;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PolicyManagement {
    public static void main(String[] args) {
        List<Policy>policies = new ArrayList<>();
//        policies.add(takePolicy());
//        policies.add(takePolicy());
//        policies.add(takePolicy());
        policies.add(new Policy("pn3","shivam",1350));
        policies.add(new Policy("pn1","ashish",1250));
        policies.add(new Policy("pn5","ashish",4003));
        policies.add(new Policy("pn2","saket",1000));
        policies.add(new Policy("pn6","saket",3005));
        policies.add(new Policy("pn4","chataniya",3000));
        printPolicy(policies);
        System.out.println();
        //use case 1
        Predicate<Policy> greaterthan1200 = s -> s.getPremiumAmount()>1200;
        List<Policy> pre1200=policies.stream().filter(greaterthan1200).collect(Collectors.toList());
        System.out.println("Policy with Premium greater than $1200");
        printPolicy(pre1200);
        System.out.println();
        //use case 2
        System.out.println("Sort Policy");
        policies.sort((Policy p1,Policy p2) -> p2.compareTo(p1));
        printPolicy(policies);
        System.out.println();
        //Use case 3
        System.out.print("Total premium sum : ");
        double sum=policies.stream().reduce(0.0,(subtotal,x) -> subtotal+x.getPremiumAmount(),Double::sum);
        System.out.println(sum);
        //filter policies between $1000 and $2000
        System.out.println("Policies between $1000 - $2000");
        Predicate<Policy> greaterThan1000= s -> s.getPremiumAmount()>=1000;
        Predicate<Policy> lessThan2000= s -> s.getPremiumAmount()<=2000;
        Predicate<Policy> combinedCondition=greaterThan1000.and(lessThan2000);
        List<Policy> pre12=policies.stream().filter(combinedCondition).toList();
        printPolicy(pre12);
        System.out.println();

        //policy with higest premium
        System.out.println("Policy with highest premium : ");
        Optional<Policy> highest=policies.stream().max((p1, p2) -> Double.compare(p1.getPremiumAmount(), p2.getPremiumAmount()));
        printPolicy(highest.stream().toList());
        System.out.println();

        //policy by holder name initial
        System.out.println("Policy with policy holder name starting from s ");
        List<Policy> inttials= policies.stream().filter(x -> x.getHolderName().startsWith("s")).toList();
        printPolicy(inttials);
        System.out.println();

        //average premium
        System.out.print("Average premium of all policies : ");
        long count = 0L;
        for (Policy policy : policies) {
            count++;
        }
        double avg= (double) (sum/count);
        System.out.println(avg);
        System.out.println();

        //sort policies by premium
        System.out.println("Printing policies sorted acc to premium amount");
        policies.sort((Policy p1,Policy p2) -> Double.compare(p1.getPremiumAmount(),p2.getPremiumAmount()));
        printPolicy(policies);
        System.out.println();

        //check if any policy exceeds a certain premium
        System.out.println("Printing policies premium greater than $2000");
        Predicate<Policy> greaterthan2000= s -> s.getPremiumAmount()>2000;
        List<Policy> premiumg2000=policies.stream().filter(greaterthan2000).toList();
        printPolicy(premiumg2000);
        if(premiumg2000.size()>0){
            System.out.println("Yes");
        }
        else System.out.println("No");
        System.out.println();

        //count policies with each premium range
        System.out.println("Policies in the range of $0 - $1000");
        Predicate<Policy> greaterthan0=s ->s.getPremiumAmount()>=0;
        Predicate<Policy> lessthan1000=s -> s.getPremiumAmount()<=1000;
        List<Policy>btw01=policies.stream().filter(greaterthan0.and(lessthan1000)).toList();
        printPolicy(btw01);
        System.out.println("Policies in the range of $1001 - $2000");
        Predicate<Policy> greaterthan1001=s ->s.getPremiumAmount()>=1001;
        Predicate<Policy> lessthan2000=s -> s.getPremiumAmount()<=2000;
        List<Policy>btw12=policies.stream().filter(greaterthan1001.and(lessthan2000)).toList();
        printPolicy(btw12);
        System.out.println("Policies greater than $2000");
        List<Policy>btw2=policies.stream().filter(greaterthan2000).toList();
        printPolicy(btw2);
        System.out.println();

        //unique policy holder name
        System.out.println("Unique Policy holder as per name ");
        Set<String> seen=new HashSet<>();
        List<Policy> unique= policies.stream().filter(policy -> seen.add(policy.getHolderName())).collect(Collectors.toList());
        printPolicy(unique);
        System.out.println();

        //find policies by holder name substring
        System.out.println("Policies contatining substring ake ");
        List<Policy> ake=policies.stream().filter(str -> str.getHolderName().contains("ake")).toList();
        printPolicy(ake);
        System.out.println();

        //create a map where key is policy no and value is premium amount
        System.out.println("Map with policy no as key and premium as value");
        Map<String,Double> mp=new HashMap<>();
        policies.stream().forEach(x -> mp.put(x.getPolicyNumber(),x.getPremiumAmount()));
        System.out.println(mp.toString());

    }

    static void printPolicy(List<Policy> list){
        for(Policy p:list){
            System.out.println(p.getPolicyNumber()+" "+p.getHolderName()+" "+p.getPremiumAmount());
        }
    }
    static Policy takePolicy() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter policy no : ");
        String pn=sc.nextLine();
        System.out.print("Name : ");
        String name=sc.nextLine();
        System.out.print("Premium : ");
        double premium=sc.nextDouble();
        return new Policy(pn,name,premium);
    }
}