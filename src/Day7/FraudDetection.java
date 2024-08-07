package Day7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    int transactionId;
    String policyNumber;
    double amount;
    Date transactionDate;
    boolean isFradulent;

    public Transaction(int transactionId, String policyNumber, double amount, Date transactionDate, boolean isFradulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFradulent = isFradulent;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", policyNumber='" + policyNumber + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", isFradulent=" + isFradulent +
                '}';
    }
}

public class FraudDetection {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "123", 15000, new Date(), true));
        transactions.add(new Transaction(2, "124", 5000, new Date(), false));
        transactions.add(new Transaction(3, "125", 20000, new Date(), true));
        transactions.add(new Transaction(4, "126", 80000, new Date(), true));
        transactions.add(new Transaction(5, "127", 12000, new Date(), false));

        List<Transaction> list = transactions.stream()
                .filter(t -> t.isFradulent && t.amount > 10000)
                .collect(Collectors.toList());
        System.out.println("\nFilter : ");
        list.forEach(System.out::println);

        System.out.println("\n Grouping : ");
        Map<String,List<Transaction>> mp = list.stream().collect(Collectors.groupingBy(a->a.policyNumber));
        mp.forEach((K,V) -> System.out.println(K + " : "+ V.toString()));

        System.out.println("\n Alert : ");
        list.stream().filter(a->a.amount>50000).forEach(System.err::println);
    }
}