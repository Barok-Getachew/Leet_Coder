class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int J = 1;
        while (J <= x / J) {
            J++;
        }
        return J - 1;
    }
}
