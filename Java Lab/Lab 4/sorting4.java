public class sorting4 {
    public static void main (String [] args)
    {
        int[] arr = {9, -5, 7, 9, -5, 5, 7};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Bubble Sort Logic
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

