import java.util.*;

public class makeStringsUppercase {
    public static void main(String[] args) {

        List<String> in = Arrays.asList("one", "two","three");
        List<String> expected = Arrays.asList("ONE", "TWO","THREE");
        assert(expected.equals( withIterator(in)));
        assert(expected.equals(withLoop(in)));
        assert(expected.equals(withReplaceAll(in)));
        System.out.println("all cases passed");
    }

    public static List<String> withIterator(List<String> input){
        Iterator<String> iter = input.iterator();
        ArrayList<String> res = new ArrayList<>();
        while (iter.hasNext()){
            res.add(iter.next().toUpperCase());
        }
        return res;
    }

    public static List<String> withLoop(List<String> input){
        List<String> result = new ArrayList<>(input);

        for (int i = 0; i < input.size(); i ++){
            result.set(i, input.get(i).toUpperCase());
        }
        return result;
    }

    public static List<String> withReplaceAll(List<String> input){
        List<String> result = new ArrayList<>(input);
        result.replaceAll(s -> s.toUpperCase());
        return result;
    }
}
