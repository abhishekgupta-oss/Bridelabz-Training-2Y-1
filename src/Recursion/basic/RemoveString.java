package Recursion.basic;

public class RemoveString {
    public static  String remove(String a,int i) {
        if(i==a.length()) {
            return "";
        }
        String small=remove(a,i+1);
        char ch=a.charAt(i);
        if(ch!='a') {
            return ch+small;
        }
        return small;
    }

    static void main() {
        String a="apple";
        System.out.println(remove(a,0));
    }
}
