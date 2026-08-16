class Solution {
    public boolean stoneGameIX(int[] stones) {
        int sum = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] % 3 == 0) {
                sum++;
            } 
            else if (stones[i] % 3 == 1) {
                j++;
            } 
            else {
                k++;
            }
        }
        if (sum % 2 == 0) {
            return j > 0 && k > 0;
        } 
        else {
            return Math.abs(j - k) > 2;
        }
    }
}