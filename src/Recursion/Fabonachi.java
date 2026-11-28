package Recursion;
import java.util.*;
public class Fabonachi {
    public static int fab(int n) {
        if(n==0||n==1) {
            return n;
        }
        int s1=fab(n-1);
        int s2=fab(n-2);
        return s1+s2;
    }


    public static void main(String[] args) {
        System.out.print(fab(6));
//		fab1(10);

    }
}