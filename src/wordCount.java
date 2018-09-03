import java.util.*;
import java.io.*;

public class wordCount {
    public static void main(String[] args) {
        countWords("/home/j/1");
    }

    private static Map<String, Integer> countWords (String filepath){
        Map<String,Integer> counter = new TreeMap<>();
        try (Scanner sc = new Scanner(new File(filepath))){
            while (sc.hasNext()){
                String w = sc.next();
                Integer currCount = counter.putIfAbsent(w, 1);
                if (currCount != null){
                    counter.put(w, ++currCount);
                }

            }

        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(counter);
        return counter;

    }
}
