import java.util.Arrays;

public class SmallestNonRepresentableSum {
    public static int findSmallest(int[] arr) {
        Arrays.sort(arr);
        int res = 1;

        for (int i = 0; i < arr.length && arr[i] <= res; i++) {
            res += arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4};
        System.out.println("Smallest non-representable sum: " + findSmallest(arr));
    }
}
