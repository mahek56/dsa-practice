import java.util.*;
public class fourth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int H=sc.nextInt();
        int T=sc.nextInt();
        int[] arr=new int[n];
        List<Integer> lis=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int left=0;
        int right=0;
        int count=0;
        int countmain=0;
        for(right=0;right<n;right++){
            if(arr[right]>H){
                count+=1;
            }
            if(right-left+1==k){
                if(count>T){
                    countmain+=1;
                }
                if(arr[left]>H){
                    count-=1;
                }
                left++;
            }
        }
        System.out.print(countmain);
    }
}