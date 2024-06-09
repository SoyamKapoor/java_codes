//Bubble Sort Code by SOYAM KAPOOR
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {56,47,41,35,22,11,15};
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j =0 ; j < arr.length -1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("After Sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}