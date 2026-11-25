package Recursion.basic;

public class BinarySearch {
    public static int binarysearch(int []arr,int start,int end,int target) {
        if(start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target) {
            return mid;
        }
        if(arr[mid]>target) {
            return binarysearch(arr,start,end-1,target);
        }
        return binarysearch(arr,start+1,end,target);
    }
    public static void main(String[] args) {
        int []arr= {1,10,15,100};
        int target=15;
        System.out.println(binarysearch(arr,0,arr.length-1,target));
    }
}
