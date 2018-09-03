import java.util.*;
//Doesnt work without ? extends. TypeError on trying to check the nested set type.
public class overlySpecificParameters{
    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> example = new HashMap<>();
        example.put("ABC", new HashSet<>());
        doStuff(example);

    }

    private static void doStuff(Map<String,? extends Set<Integer>> arg){
        System.out.println(arg);
    }
}
