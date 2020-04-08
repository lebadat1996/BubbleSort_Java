package BubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 8, 1, 9};
        bubbleSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
