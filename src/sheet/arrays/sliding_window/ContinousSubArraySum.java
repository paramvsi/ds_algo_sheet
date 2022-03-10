package sheet.arrays.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArraySum {
    // [23,2,4,6,7], k = 6
    public boolean checkSubArraySum(int[] arr, int k) {
        Map<Integer, Integer> cumSumMap = new HashMap<>();
        cumSumMap.put(0, 1);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sum = sum % k;

            if (cumSumMap.get(sum) - i >= 2) {
                return true;
            } else {
                cumSumMap.putIfAbsent(sum, i);
            }
        }
        return false;
    }
}
