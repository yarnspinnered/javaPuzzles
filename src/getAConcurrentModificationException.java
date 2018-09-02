import java.util.*;

public class getAConcurrentModificationException {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("a");

        for (String s : arrList){
            System.out.println(s);
            arrList.add("e");
        }
        System.out.println(arrList);
    }


}
