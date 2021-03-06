import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        HashSet<Integer> HS1 = new HashSet<>();
        HashSet<Integer> HS2 = new HashSet<>();
        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS2.add(10);
        HS2.add(20);
        HS2.add(40);
        HashSet<Integer> HS3 = new HashSet<>();
        HS1.forEach((n) -> {
            if (HS2.contains(n))
                HS3.add(n);
        });
        HS2.forEach((n) -> {
            if (HS1.contains(n))
                HS3.add(n);
        });
        HS3.forEach((n) -> {
            HS1.remove(n);
            HS2.remove(n);
        });
        System.out.println(HS1);
        System.out.println(HS2);
    }
}