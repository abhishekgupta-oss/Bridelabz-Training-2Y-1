package Arrays.LogicBuilding;
import java.util.*;
public class longestSubString {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[]=new int[256];
        int max=0;
        int left=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(left)]--;
                left++;
                max=Math.max(max, i-left+1);
            }
            System.out.println(max);
        }

    }
}
