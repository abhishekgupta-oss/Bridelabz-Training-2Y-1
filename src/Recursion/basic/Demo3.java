package Recursion.basic;

public class Demo3 {
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    static void main(String[] args) {
        print(6);
    }
}
