package sheet.arrays.simple;

// Find the sum of the largest sub array.

public class MaximumSubArray {
    public int maxSum(int[] numbers) {
        int sum = 0;
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
