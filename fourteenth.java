import java.util.*;

public class fourteenth {
    public static void main(String[] args){
        String L = "cbaebabacd";
        String P = "abc";
        List<Integer> result = new ArrayList<>();
        if(L.length() < P.length()){
            System.out.println(result);
            return;
        }
        int[] freqP = new int[26];
        int[] freqW = new int[26];
        for(char c : P.toCharArray()){
            freqP[c - 'a']++;
        }
        int k = P.length();
        for(int i = 0; i < L.length(); i++){
            freqW[L.charAt(i) - 'a']++;
            if(i >= k){
                freqW[L.charAt(i - k) - 'a']--;
            }
            if(Arrays.equals(freqP, freqW)){
                result.add(i - k + 1);
            }
        }
        System.out.println(result);
    }
}