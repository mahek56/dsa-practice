import java.util.*;
public class seventh{
    public static void main(String[] args){
        int arr[]={1,0,1,0,1,0,1};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        for(right=0;right<arr.length;right++){
            if(arr[right]==0){
            count+=1;
        }
            while(count>k){
                if(arr[left]==0){
                    count--;
                }
                left++;
            }
         maxcount=Math.max(maxcount,right-left+1);
        }
        System.out.print(maxcount);
    }
}