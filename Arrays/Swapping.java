import java.util.Arrays;

public class Swapping{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int i = 1;
        int j = 3;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));
    }
}