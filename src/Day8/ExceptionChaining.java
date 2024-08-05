package Day8;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChaining {
    public static void main(String[] args) {
        try{
            throwIo();
        }catch (Exception e){
            System.out.println("Caught : "+ e);
            System.out.println("Cause : "+e.getCause());
        }
    }
    static void throwIo() throws IOException {
        var error=new IOException("Input output exception");
        error.initCause(new IOException());
        throw error;
    }
}