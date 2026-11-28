package Recursion.basic;

public class Demo4 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
         int small=factorial(n-1);
return n*small;
}

    static void main(String[] args) {
        System.out.println(factorial(5));
    }
}