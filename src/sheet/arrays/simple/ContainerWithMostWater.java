package sheet.arrays.simple;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] arr) {
        int maxArea = 0;
        int minHeight = Integer.MAX_VALUE;

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            minHeight = Math.min(arr[low], arr[high]);
            maxArea = Math.max(maxArea, (high - low) * minHeight);

            while (low < high && arr[low] <= minHeight) low++;
            while (low < high && arr[high] <= minHeight) high--;
        }

        return maxArea;
    }
}
