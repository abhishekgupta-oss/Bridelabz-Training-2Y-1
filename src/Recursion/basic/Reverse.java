package Recursion.basic;
import java.util.*;
public class Reverse {
        public static void print(String a,int i) {
            if(i==a.length()) {
                return;
            }
            System.out.print(a.charAt(i));
            print(a,i+1);
        }
        public static void printreverse(String a,int i) {
            if(i==a.length()) {
                return;
            }
            printreverse(a,i+1);
            System.out.print(a.charAt(i));
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String a=sc.nextLine();
            print(a,0);
            System.out.println();
            printreverse(a,0);
        }
    }
