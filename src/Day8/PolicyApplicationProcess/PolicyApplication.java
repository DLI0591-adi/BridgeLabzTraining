package Day8.PolicyApplicationProcess;



import java.util.Scanner;

public class PolicyApplication {
    private int age;
    private String drivingHistory;
    private String healthRecord;
    PolicyApplication(int age,String drivingHistory,String healthRecord){
        this.age=age;
        this.drivingHistory=drivingHistory;
        this.healthRecord=healthRecord;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDrivingHistory() {
        return drivingHistory;
    }

    public void setDrivingHistory(String drivingHistory) {
        this.drivingHistory = drivingHistory;
    }

    public String getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(String healthRecord) {
        this.healthRecord = healthRecord;
    }
    public static PolicyApplication takeApplication(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        InvalidAgeException iage=new InvalidAgeException();
        int age=0;
        try{
            age=sc.nextInt();
            iage.checkAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        sc.nextLine();
        System.out.print("Driving History : ");
        String dh="";
        PoorDrivingException poor=new PoorDrivingException();
        try{
            dh=sc.nextLine();
            poor.checkDrivingHistory(dh);
        }
        catch (PoorDrivingException e){
            System.out.println(e.getMessage());
        }
        System.out.print("Health Record : ");
        HealthIssueException h=new HealthIssueException();
        String hr="";
        try{
            hr=sc.nextLine();
            h.checkHealth(hr);
        }
        catch (HealthIssueException e){
            System.out.println(e.getMessage());
        }
        PolicyApplication p=new PolicyApplication(age,dh,hr);
        return p;
    }
    public static void main(String[] args) {
        PolicyApplication p1=takeApplication();
    }
}