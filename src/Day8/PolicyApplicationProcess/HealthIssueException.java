package Day8.PolicyApplicationProcess;

public class HealthIssueException extends Exception{
    HealthIssueException(){
        super("your health is sick");
    }
    public void checkHealth(String hr) throws HealthIssueException {
        if(hr.equals("sick")) throw new HealthIssueException();
    }
}