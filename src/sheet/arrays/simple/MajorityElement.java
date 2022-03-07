package sheet.arrays.simple;

public class MajorityElement {
    public int majorityElement(int[] arr){
        int count = 0;
        Integer candidate = null;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
