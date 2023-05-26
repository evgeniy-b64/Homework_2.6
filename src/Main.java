import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello homework 2.6");
        System.out.println("Задание 1: "+Task1());
        System.out.println("Задание 2: "+Task2());
        System.out.println("Задание 3: "+Task3());
        System.out.println("Задание 4: "+Task4());
    }

    private static List<Integer> Task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 1) result.add(num);
        }
        return result;
    }

    private static Set<Integer> Task2() {
        List<Integer> nums = new ArrayList<>(List.of(8, 8, 122, 3, 44, 4, 5, 5, 6, 7));
        Set<Integer> result = new TreeSet<>(Comparator.naturalOrder());
        for (Integer num : nums) {
            if (num % 2 == 0) result.add(num);
        }
        return result;
    }

    private static Set<String> Task3() {
        List<String> words = new ArrayList<>(List.of("Наша", "Таня", "громко", "громко", "плачет", "уронила", "в", "в", "речку", "мячик", "мячик"));
        Set<String> result = new HashSet<>(words);
        return result;
    }

    private static Map<String, Integer> Task4() {
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "четыре", "семь", "три"));
        Map<String, Integer> result = new HashMap<>();
        //Set<String> result = new HashSet<>(words);
        for (String word : words) {
            if (result.containsKey(word)) {
                Integer count = result.get(word) + 1;
                result.put(word, count);
            } else result.put(word, 1);
        }
        return result;
    }
}