package Arrays.LogicBuilding;
import java.util.*;
public class MinimumElementinArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int arr2[]={};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=arr[i]+arr[i+1];
             arr2= new int[]{sum};
        }
        System.out.println(arr2);
    }
}
