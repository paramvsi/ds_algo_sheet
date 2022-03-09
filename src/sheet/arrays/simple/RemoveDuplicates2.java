package sheet.arrays.simple;

import org.jetbrains.annotations.NotNull;

// Same as Remove Duplicate One.. Just here at most 2 duplicates elements need to stay..
public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 2, 2, 3};

        System.out.println("Total num is :" + removeDuplicate(num));
    }

    public static int removeDuplicate(int @NotNull [] numbers) {
        int i = 1;
        int j = i + 1;
        int len = numbers.length;

        while (j < numbers.length) {
            if (numbers[j] == numbers[i] && numbers[i] == numbers[i - 1]) {
                j++;
                len--;
            } else {
                numbers[++i] = numbers[j++];
            }
        }

        return len;
    }
}
