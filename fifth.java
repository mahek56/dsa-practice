import java.util.*;
public class fifth{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char[] arr=str.toCharArray();
    HashSet<Character> hs=new HashSet<>();
    int left=0;
    int right=0;
    int maxlength=0;
    int start=0;
    for(right=0;right<str.length();right++){
        while(hs.contains(arr[right])){
            hs.remove(arr[left]);
            left++;
        }
        hs.add(arr[right]);
        if(right-left+1>maxlength){
            start=left;
        maxlength=Math.max(maxlength,right-left+1);
        }
    }
    System.out.println(str.substring(start,start+maxlength));
}
}