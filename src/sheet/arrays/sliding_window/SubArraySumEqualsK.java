package sheet.arrays.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public int subArraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> cumSumMap = new HashMap<>();
        cumSumMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (cumSumMap.containsKey(sum - k)) {
                count += cumSumMap.getOrDefault(sum - k, 0);
            }
            cumSumMap.put(sum, cumSumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
