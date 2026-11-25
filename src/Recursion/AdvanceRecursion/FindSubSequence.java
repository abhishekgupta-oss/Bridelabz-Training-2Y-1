package Recursion.AdvanceRecursion;
import java.util.*;
public class FindSubSequence {
    public static ArrayList<String>getSSQ(String a){
        ArrayList<String>ans=new ArrayList<>();
        if(a.length()==0){
            ans.add(" ");
            return ans;
        }
        char ch=a.charAt(0);
        ArrayList<String> smallans=getSSQ(a.substring(1));
        for(String ss : smallans){
            ans.add(ss);
            ans.add(ch+ss);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void getSSQvoid(String a){
        ArrayList<String> ans=new ArrayList<>();
        if(a.length()==0){
            ans.add(" ");
            System.out.println(ans);
            return;
        }
        char ch=a.charAt(0);
        ArrayList<String> smallans=getSSQ(a.substring(1));
        for(String ss : smallans){
            ans.add(ss);
            ans.add(ch+ss);
        }
        System.out.println(ans);
    }

    static void main(String[] args) {
        System.out.println(getSSQ("abc"));
        getSSQvoid("abc");
    }
}
