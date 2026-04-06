// import java.util.*;
// public class second{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         int[] arr=new int[500];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//     }
//     HashMap<Integer, List<List<Integer>>> map=new HashMap<>();    
//     int left=0;
//     int right;
//     int min=Integer.MAX_VALUE;
//     int start=0;
//     int sum=0;
//     for(right=0;right<n;right++){
//         sum+=arr[right];
//         if(right-left+1>k){
//             sum-=arr[left];
//             left++;
//         }
//         if(right-left+1==k){
//             if(sum<min){
//                 min=sum;
//                 start=left;
//             }
        
//         List<Integer> lis=new ArrayList<>();
//         for(int i=left;i<=right;i++){
//             lis.add(arr[i]);
//         }
//         map.putIfAbsent(sum, new ArrayList<>());
//                 map.get(sum).add(lis);

// map.get(sum).add(lis);
//         }
//             }
//             System.out.print(map);
//     }
// }

import java.util.*;

public class second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];   // better than fixed size
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            if (right - left + 1 > k) {
                sum -= arr[left];
                left++;
            }

            if (right - left + 1 == k) {

                // track minimum window
                if (sum < min) {
                    min = sum;
                    start = left;
                }

                // store window in map
                List<Integer> lis = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    lis.add(arr[i]);
                }

                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(lis);   // ONLY ONCE
            }
        }

        // print map
        System.out.println("Map: " + map);

        // print minimum sum
        System.out.println("Min Sum: " + min);

        // print corresponding window
        System.out.print("Min Window: ");
        for (int i = start; i < start + k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}