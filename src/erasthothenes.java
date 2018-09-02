import java.util.*;

public class erasthothenes {
    public static void main(String[] args) {

        System.out.println(sieve(11));
    }

    static ArrayList<Integer> sieve(int n){
        BitSet tracker = new BitSet(n + 1);
        tracker.set(0, n + 1);

        for (int i = 2; i < tracker.length(); i++){
            if (tracker.get(i)){
                for (int j = 2; j * i <= tracker.length(); j++){
                    tracker.clear(j * i);
                }
            } else {
                continue;
            }

        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i < tracker.length(); i++){
            if (tracker.get(i)){
                result.add(i);
            }
        }
        return result;
    }
}
