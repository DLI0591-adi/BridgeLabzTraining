package Day8;


public class ExceptionHierarchy {
    public static void main(String[] args) {
        int n1=340,n2=0;
        String ptr=null;
        try{
            int ans = n1/n2;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            if(ptr.equals("ashish")){
                System.out.println("Same");
            }
            else System.out.println("Not same");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
