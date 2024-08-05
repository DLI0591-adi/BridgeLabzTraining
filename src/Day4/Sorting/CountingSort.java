package Day4.Sorting;

public class CountingSort {
    public static void countingSort(int[] array) {
        int n = array.length;
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        countingSort(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
