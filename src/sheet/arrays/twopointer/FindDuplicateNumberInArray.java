package sheet.arrays.twopointer;

public class FindDuplicateNumberInArray {

    public static int duplicateNumber(int[] numbers) {
        int h = numbers[0];
        int t = numbers[0];

        // find intersection point of two runners
        while (true) {
            h = numbers[numbers[h]];
            t = numbers[t];
            if (h == t) {
                break;
            }
        }

        // find starting point of cycle.
        t = numbers[0];
        while (t != h) {
            h = numbers[h];
            t = numbers[t];
        }

        return h;
    }
}
