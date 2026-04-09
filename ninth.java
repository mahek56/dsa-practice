import java.util.*;
public class ninth {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= T) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLen);
        }
    }
}