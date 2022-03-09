package sheet.arrays.simple;

public class RemoveDuplicatesFromASortedArray {
    public int removeDuplicate(int[] numbers) {
        int i = 0;
        int j = 1;
        int count = 0;

        while (j < numbers.length) {
            if (numbers[i] == numbers[j]) j++;
            else {
                count++;
                numbers[++i] = numbers[j++];
            }
        }

        return count;
    }
}
