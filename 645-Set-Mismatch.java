class Solution {
    public int[] findErrorNums(int[] nums) {
        long n = nums.length;
        long expectedSum = n * (n + 1) / 2;
        long expectedSumSquares = n * (n + 1) * (2 * n + 1) / 6;
        
        long actualSum = 0;
        long actualSumSquares = 0;
        for (int num : nums) {
            actualSum += num;
            actualSumSquares += (long) num * num;
        }
        long diff1 = actualSum - expectedSum;
        long diff2 = actualSumSquares - expectedSumSquares;
        long sumPlus = diff2 / diff1;
        int duplicate = (int) (sumPlus + diff1) / 2;
        int missing = (int) (sumPlus - duplicate);
        
        return new int[]{duplicate, missing};
    }
}