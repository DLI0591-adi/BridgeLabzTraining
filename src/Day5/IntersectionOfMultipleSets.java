package Day5;

import java.util.*;

public class IntersectionOfMultipleSets {
    public static void main(String[] args) {
        List<Set<Integer>> sets=new ArrayList<>();
        sets.add(Set.of(3,1,2));
        sets.add(Set.of(2,3,4));
        sets.add(Set.of(4,3,5));
        System.out.println(sets);
        Set<Integer>hashsetIntesection=findIntersectionHashSet(sets);
        Set<Integer>linkedHashSetIntesection=findIntersectionLinkedHashSet(sets);
        Set<Integer>treeSetIntesection=findIntersectionTreeSet(sets);
        System.out.println("From HashSet : "+hashsetIntesection);
        System.out.println("From LinkedHashSet : "+linkedHashSetIntesection);
        System.out.println("From TreeSet : "+treeSetIntesection);
    }
    static Set<Integer> findIntersectionHashSet(List<Set<Integer>> sets){
        Set<Integer>intersection=new HashSet<>(sets.get(0));
        for(int i=1;i<sets.size();i++){
            intersection.retainAll(sets.get(i));
        }
        return intersection;
    }
    static Set<Integer> findIntersectionLinkedHashSet(List<Set<Integer>> sets){
        Set<Integer>intersection=new LinkedHashSet<>(sets.get(0));
        for(int i=1;i<sets.size();i++){
            intersection.retainAll(sets.get(i));
        }
        return intersection;
    }
    static Set<Integer> findIntersectionTreeSet(List<Set<Integer>> sets){
        Set<Integer>intersection=new TreeSet<>(sets.get(0));
        for(int i=1;i<sets.size();i++){
            intersection.retainAll(sets.get(i));
        }
        return intersection;
    }
}