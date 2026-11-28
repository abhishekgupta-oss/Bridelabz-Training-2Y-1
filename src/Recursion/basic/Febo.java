package Recursion.basic;

public class Febo{
    public static int feb(int n){
        if(n==0 || n==1){
          return 1;
        }
        int small1=feb(n-1);
        int small2=feb(n-2);
        return small1+small2;
    }
    public static void main(String[] args) {
        System.out.println(feb(8));
    }

}
