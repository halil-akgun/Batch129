package advanced_practice.practice13;

import java.util.*;

public class Family {
    private Map<String, String> nameLastName = new HashMap<>();
    private List<String> siblingsList = new ArrayList<>();
    private Map<Integer, List<String>> ageSiblings = new HashMap<>();
    private Map<Map<String, String>, Map<Integer, List<String>>> familyMap = new HashMap<>();

    public Family(String name, String lastName, int age, String... siblings) {
        nameLastName.put(name, lastName);
        siblingsList.addAll(Arrays.asList(siblings));
        ageSiblings.put(age, siblingsList);
        familyMap.put(nameLastName, ageSiblings);
    }

    public Map<Map<String, String>, Map<Integer, List<String>>> getFamilyMap() {
        return familyMap;
    }
}
