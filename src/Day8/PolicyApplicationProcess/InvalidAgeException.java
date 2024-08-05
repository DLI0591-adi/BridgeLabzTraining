package Day8.PolicyApplicationProcess;

public class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super("We don't accept policies for age less than 18");
    }
    public void checkAge(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException();
    }
}
