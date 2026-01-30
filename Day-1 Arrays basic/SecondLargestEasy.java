import java.util.Arrays;
public class SecondLargestEasy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        Arrays.sort(arr);
        System.out.println("Second largest = " + arr[arr.length - 2]);
    }
}
