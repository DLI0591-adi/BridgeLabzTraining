package Day6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,4,5,6,7,8));
        int ans=list.stream().filter(n -> n%2==0).map(n -> n*n).reduce(0,(a,b) -> a+b );
        System.out.println(ans);
    }
}

