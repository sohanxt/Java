
public class maxmin2 {
    public static void main(String[] args) {
        int[] arr = {9, -5, 7, 9, -5, 5, 7};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
    
}
