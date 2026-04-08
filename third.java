import java.util.*;
public class third{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int T=sc.nextInt();
        int[] arr=new int[n];
        List<Integer> lis=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int left=0;
        int sum=0;
        int right=0;
        int start=0;
        for(right=0;right<n;right++){
            sum+=arr[right];
            if(right-left+1==k){
                
                if(sum>T){

                    lis.add(left);
                }
                // start=left;
                // lis.add(left);
                sum-=arr[left];
                left++;
            }
            
        }
        System.out.print(lis);
    }
}