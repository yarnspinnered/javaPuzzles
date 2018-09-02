import java.util.*;

public class basicSetOps {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Collections.addAll(setA, 1,2,3,4,5,6);
        Set<Integer> setB = new HashSet<>();
        Collections.addAll(setB, 4,5,6, 7, 8, 9);

        Set<Integer> setUnion = new HashSet<>();
        setUnion.addAll(setA);
        setUnion.addAll(setB);
        System.out.println("UNION: " + setUnion);

        Set<Integer> setIntersection = new HashSet<>();
        setIntersection.addAll(setA);
        setIntersection.removeIf(x -> !setB.contains(x));
        System.out.println("INTERSECTION: " + setIntersection);

    }

}
