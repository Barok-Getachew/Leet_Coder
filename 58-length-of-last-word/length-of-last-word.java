public class Solution {
    public int lengthOfLastWord(String s) {
        char[] str = s.toCharArray();
        int i = str.length - 1;
        int j = 0;

        // Skip trailing spaces
        while (i >= 0 && str[i] == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && str[i] != ' ') {
            j++;
            i--;
        }

        return j;
    }
}
