package Arrays.Leetcode;
import java.util.*;

public class Leetcode_1295 {
    public static int findNumbers(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if((arr[i]>9 && arr[i]<100)||(arr[i]>999 && arr[i]<10000)||(arr[i]==100000)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n=sc.nextInt();
        int num[]=new int[n];
          for(int i=0; i<n; i++){
              num[i]=sc.nextInt();
          }
        System.out.println(findNumbers(num));


    }
}
