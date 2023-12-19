class Solution {
    public int smallestEvenMultiple(int n) {
        int smallestEven = 0;
        if(n%2 == 0){
                smallestEven=n;
        }else{
            smallestEven = n*2;
        }

        return smallestEven;
    }
}