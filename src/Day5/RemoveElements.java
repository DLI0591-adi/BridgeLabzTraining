package Day5;

import java.util.*;

public class RemoveElements {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        TreeSet<Integer> treeSet= new TreeSet<>(list);
        int thresold=3;
        remove(treeSet,thresold);
    }

    private static void remove(TreeSet<Integer> treeSet, int thresold) {
        Iterator<Integer> it = treeSet.iterator();
        while(it.hasNext()){
            Integer present=it.next();
            if(present<thresold){
                it.remove();
            }
            else{
                System.out.print(present+" ");
            }

        }


    }
}