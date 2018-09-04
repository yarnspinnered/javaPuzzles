import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class stringToLinesOccurred {
    public static void main(String[] args) {
        System.out.println(getStringToLinesOccurred("/home/j/1"));
    }

    public static Map<String,HashSet<Integer>> getStringToLinesOccurred(String filepath){
        TreeMap<String, HashSet<Integer>> r = new TreeMap<>();
        try (Scanner in = new Scanner(new File(filepath));){
            int i = 1;
            while (in.hasNextLine()){
                String line = in.nextLine();
                for (String s : line.split(" ")){
                    if (!s.equals("")){
                        HashSet<Integer> currVal = r.getOrDefault(  s, new HashSet<>());
                        currVal.add(i);
                        r.put(s, currVal);
                    }
                }
                i++;
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return r;

    }
}
