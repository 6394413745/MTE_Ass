import java.util.Arrays;

public class prefixSum {
    public static int[] prefix(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 17, 10, 11};
        int[] prefixSum = prefix(arr);
        System.out.println(Arrays.toString(prefixSum));
    }
}
