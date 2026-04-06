import java.util.*;
public class first{
    public static void main(String[] args){
        HashMap<Integer,List> map=new HashMap<>();
        
        int sum=0;
        int left=0;
        int maxsum=Integer.MIN_VALUE;
        int leftl=0;
        // ArrayList<Integer> lis=new ArrayList<>();
                int[] temp = {13, 21, 18, 25, 27, 22, 19};
        for(int right=0;right<temp.length;right++){
            sum+=temp[right];
            if(right-left+1>3){
                sum-=temp[left];
                left++;
            }
            if (right - left + 1 == 3) {
                if(sum>maxsum){
                    maxsum=sum;
                    leftl=left;
            }
            }

}
            for(int i=leftl;i<leftl+3;i++){
                System.out.print(temp[i] + " ");
            }
    }
}





