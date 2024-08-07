package Day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Claim{
    int claimId;
    String policyNumber;
    double claimAmount;
    Date claimDate = new Date("dd-mm-yyyy");
    String status;

    public Claim(int claimId, String policyNumber, double claimAmount, Date claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", policyNumber=" + policyNumber +
                ", claimAmount=" + claimAmount +
                ", claimDate=" + claimDate +
                ", status='" + status + '\'' +
                '}';
    }
}

public class ClaimAnalysis {
    public static void main(String[] args) throws ParseException {
        List<Claim> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = sdf.parse("12-03-2024");
        Date date2 = sdf.parse("13-03-2024");
        Date date3 = sdf.parse("14-03-2024");
        Date date4 = sdf.parse("15-03-2024");
        list.add(new Claim(1,"123",20000,date1,"Approved"));
        list.add(new Claim(12,"1234",2000,date2,"Rejected"));
        list.add(new Claim(13,"1235",9000,date3,"Under Process"));
        list.add(new Claim(14,"1236",10000,date4,"Approved"));

        System.out.println("Filter : ");
        list.stream().filter(a->a.status.equals("Approved")&& a.claimAmount>5000).forEach(System.out::println);

        System.out.println("\nGrouping : ");
        Map<String,List<Claim>> mp = list.stream().collect(Collectors.groupingBy(a -> a.policyNumber));
        mp.forEach((K,V) -> System.out.println("Key : "+K + "Value : "+V.toString()));

        Double sum = list.stream().collect(Collectors.summingDouble(a -> a.claimAmount));
        System.out.println("\nTotal ClaimAmount : "+sum);

        System.out.println("\nAverage claim amount : "+sum/ list.size());





    }
}
