package Day8;


public class FinallyBlock {
    public static void main(String[] args) {
        int n=100,n2=0;
        try{
            int ans=n/n2;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Divison operation is complete");
        }
    }
}