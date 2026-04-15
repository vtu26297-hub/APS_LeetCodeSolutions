import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a, b) -> distance(a) - distance(b));
        
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = points[i];
        }
        return res;
    }
    
    private int distance(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }
}