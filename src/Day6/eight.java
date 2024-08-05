package Day6;

import java.util.function.BiFunction;

public class eight {
    public static void main(String[] args) {

        String a="Hello";
        String b="Saha";

        BiFunction<String,String,String> connector=(String s1,String s2) -> s1+" "+s2;

        String result= connector.apply(a,b);
        System.out.println(result);

    }
}
