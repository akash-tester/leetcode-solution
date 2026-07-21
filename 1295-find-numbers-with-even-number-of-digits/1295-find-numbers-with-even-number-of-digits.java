class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if (digitsCount(num) % 2 == 0) {
                result++;
            }
        }

        return result;
    }

    private int digitsCount(int num) {
        return (int) Math.log10(num) + 1;
    }
}