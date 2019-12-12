package Code;

import Code.Class.Duck;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Duck, String> duckMap = new HashMap<>();

        duckMap.put(new Duck("Sir Quackalot", "Mallard", 100, 17), "duck1");
        duckMap.put(new Duck("Untitled Duck Name", "null", 999999999, 999999999), "duck2");
        duckMap.put(new Duck("Steve Rambo", "Goo", 27, 3), "duck3");
        duckMap.put(new Duck("Eternal Atake", "Unreleased", 0, 0), "duck4");

        // Cami came over and helped me out with hashmaps and showed me some appropriate sources for sorting them as I got a bit stuck :)
        // https://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html
        TreeMap<Duck, String> treeDuck = new TreeMap<>(duckMap);
        Set<Map.Entry<Duck, String>> mappings = treeDuck.entrySet();

        for (Map.Entry<Duck, String> mapping : mappings) {
            System.out.println(mapping.getKey().getName());
        }
    }
}

