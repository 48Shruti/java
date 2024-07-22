public class day12Sorting {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        int temp = 0;
        // Bubble sort
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestElement] > arr[j]) {
                    smallestElement = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[smallestElement];
            arr[smallestElement] = temp;

        }
        print(arr);

    }
}
