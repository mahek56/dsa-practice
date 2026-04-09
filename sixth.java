import java.util.*;
public class sixth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        char[] arr=str.toCharArray();
        HashMap<Character,Integer> map =new HashMap<>();
        int right=0;
        int maxlength=0;
        int left=0;
        for(right=0;right<str.length();right++){
            // while(set.contains(arr[right])){
            //     set.remove(arr[left]);
            //     left++;
            char c=arr[right];
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()>k){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
            }
            System.out.print(maxlength);
        }
}