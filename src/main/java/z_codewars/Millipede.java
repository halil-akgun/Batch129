package z_codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Millipede {
    public static boolean check(String[] millipede) {
        // Create a graph where each word is a vertex, and there is an edge between
        // two vertices if the last letter of one word is the same as the first letter
        // of the other
        Map<String, List<String>> graph = new HashMap<>();
        for (int i = 0; i < millipede.length; i++) {
            for (int j = i + 1; j < millipede.length; j++) {
                if (millipede[i].charAt(millipede[i].length() - 1) == millipede[j].charAt(0)) {
                    if (!graph.containsKey(millipede[i])) {
                        graph.put(millipede[i], new ArrayList<>());
                    }
                    graph.get(millipede[i]).add(millipede[j]);
                    if (!graph.containsKey(millipede[j])) {
                        graph.put(millipede[j], new ArrayList<>());
                    }
                    graph.get(millipede[j]).add(millipede[i]);
                }
            }
        }

        // Check whether there is a cycle in the graph
        boolean[] visited = new boolean[millipede.length];
        for (int i = 0; i < millipede.length; i++) {
            if (dfs(millipede[i], -1, graph, visited)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(String node, int parent, Map<String, List<String>> graph, boolean[] visited) {
        visited[indexOf(node, graph.keySet().toArray(new String[0]))] = true;
        List<String> neighbors = graph.get(node);
        if (neighbors != null) {
            for (String neighbor : neighbors) {
                int index = indexOf(neighbor, graph.keySet().toArray(new String[0]));
                if (index == parent) {
                    continue;
                }
                if (visited[index] || dfs(neighbor, indexOf(node, graph.keySet().toArray(new String[0])), graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int indexOf(String element, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] millipede = {"excavate", "endure", "desire", "screen", "theater", "excess", "night"};
        System.out.println(check(millipede));  // Output: true

        millipede = new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"};
        System.out.println(check(millipede));  // Output: false
    }
}