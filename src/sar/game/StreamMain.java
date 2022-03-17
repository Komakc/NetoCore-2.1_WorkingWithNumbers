package sar.game;

import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void findPositiveAndEvenAPI(List<Integer> list) {
        list.stream().filter(x -> x > 0 && x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
