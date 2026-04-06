import java.util.*;

public class firstm{
    public static void main(String[] args) {

        int[] temp = {13, 21, 18, 25, 27, 22, 19};
        int k = 3;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;
        int left = 0;

        for (int right = 0; right < temp.length; right++) {

            // expand
            sum += temp[right];

            // shrink if needed
            if (right - left + 1 > k) {
                sum -= temp[left];
                left++;
            }

            // when window size == k
            if (right - left + 1 == k) {

                // create NEW list (IMPORTANT)
                List<Integer> window = new ArrayList<>();

                for (int i = left; i <= right; i++) {
                    window.add(temp[i]);
                }

                // store in map
                map.put(sum, window);
            }
        }

        // print map
        System.out.println(map);
    }
}