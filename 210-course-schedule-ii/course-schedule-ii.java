import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        
        int[] indegree = new int[numCourses];
        
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }
        
        int[] result = new int[numCourses];
        int index = 0;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            result[index++] = cur;
            
            for (int nei : graph.get(cur)) {
                indegree[nei]--;
                if (indegree[nei] == 0) q.offer(nei);
            }
        }
        
        return index == numCourses ? result : new int[0];
    }
}