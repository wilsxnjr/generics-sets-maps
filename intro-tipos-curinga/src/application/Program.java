package application;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInt = Arrays.asList(7, 11, 9);
        printList(myInt);

        List<String> myStr = Arrays.asList("Ronaldo", "Bale", "Benzema");
        printList(myStr);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
