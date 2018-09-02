import java.util.*;
import java.lang.Math;

public class swapInAList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3);
        simpleSwap(arr, 1, 2);
        System.out.println(arr);


    }

    public static <T> void simpleSwap(List<T> list, int i, int j){
        T tmp = list.get(j);
        list.set(j, list.get(i));
        list.set(i, tmp);
    }

}
