import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividing = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                selfDividing.add(i);
            }
        }
        return selfDividing;
    }

    public boolean isSelfDividing(int num) {
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0' || num % (c - '0') > 0) {
                return false;
            }
        }
        return true;
    }
}
